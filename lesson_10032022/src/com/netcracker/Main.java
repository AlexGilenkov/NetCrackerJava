package com.netcracker;

import com.netcracker.figures.*;

public class Main {
    public static void main(String[] args){

        Circle circle = new Circle(10, "blue");

        System.out.println(circle);
        System.out.println(circle.calculateArea());

    }
}
