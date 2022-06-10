package com.netcracker;

import com.netcracker.beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "app-config.xml");

        Car tiguan = (Car) applicationContext.getBean("vw-tiguan");
        Car rapid = (Car) applicationContext.getBean("skoda-rapid");

        tiguan.getEngine().drive();
        rapid.getEngine().drive();

        System.out.println(tiguan.getVin());
        System.out.println(rapid.getVin());

    }
}
