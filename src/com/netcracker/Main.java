package com.netcracker;

import com.netcracker.figures.Circle;
import com.netcracker.lambda.math.Addition;
import com.netcracker.lambda.math.MathOperation;
import com.netcracker.lambda.math.MathOperator;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Circle circle = new Circle(25.3, "green");

        String className = "com.netcracker.figures.Circle";

        Class clazz = Class.forName(className);

        Object o = clazz.getDeclaredConstructor(double.class, String.class ).newInstance(10.5, "green");
        Object o1 = clazz.getDeclaredConstructor().newInstance();

        Circle circle1 = (Circle) o;
        System.out.println(o);
        System.out.println(o1);



    }

}
