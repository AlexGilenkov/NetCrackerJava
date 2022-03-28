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

            @Override
            public String getShapeName() {
                return "Teremok";
            }
        };

        System.out.println(triangle.getShapeName());
        System.out.println(rectangle.getShapeName());
        System.out.println(teremok.getShapeName());

    }


}
