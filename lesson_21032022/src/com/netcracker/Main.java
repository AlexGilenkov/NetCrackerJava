package com.netcracker;

import com.netcracker.figures.*;

import java.util.function.ObjDoubleConsumer;

public class Main {
    public static void main(String[] args){

        IShape triangle = new Triangle(6,12, "");
        IShape rectangle = new Rectangle(10, 5, "blue");

        IShape teremok = new IShape() {

            int base = 10;
            int height = 20;

            @Override
            public double calculateArea() {
                return Math.pow(base,2)+ height*base*0.5;
            }
        };



        System.out.println(triangle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(teremok.calculateArea());

        System.out.println(triangle instanceof IShape);
        System.out.println(rectangle instanceof IShape);
        System.out.println(teremok instanceof IShape);
        
    }


}
