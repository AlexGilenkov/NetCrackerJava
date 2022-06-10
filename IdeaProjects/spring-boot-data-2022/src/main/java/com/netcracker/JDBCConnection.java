package com.netcracker;

import com.netcracker.entity.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

    public static void main(String[] args) {

        JDBCConnection jdbcConnection = new JDBCConnection();
        List<Employee> employees = jdbcConnection.retrieveAll();

        employees.forEach(System.out::println);
    }

    List<Employee> result = new ArrayList<>();

    public List<Employee> retrieveAll() {
        try (Connection connection = prepareConnection()){

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");

            while(resultSet.next()){
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setPosition(resultSet.getString("position"));
                employee.setSalary(resultSet.getDouble("salary"));
                result.add(employee);
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }

    private Connection prepareConnection() throws ClassNotFoundException, SQLException {

        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/testdb",
                "tester", "12345");
        Class.forName("org.postgresql.Driver");

        return connection;
    }

}
