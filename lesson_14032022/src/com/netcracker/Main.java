package com.netcracker;

import com.netcracker.figures.*;

import java.util.function.ObjDoubleConsumer;

public class Main {
    public static void main(String[] args){

        Circle circle = new Circle(10, "blue");

        Cylinder cylinder = new Cylinder(2.0, "black", 5.0);

        //System.out.println(cylinder);
        //System.out.println(cylinder.calculateArea());
        //Cylinder cylinder2 = (Cylinder) cylinder;
        //System.out.println(cylinder2.calculateVolume());

        System.out.println(circle instanceof Circle);
        System.out.println(circle instanceof Cylinder);
        System.out.println(circle instanceof Object);

        System.out.println("==========================");

        System.out.println(cylinder instanceof Circle);
        System.out.println(cylinder instanceof Cylinder);
        System.out.println(cylinder instanceof Object);

        System.out.println("==========================");

        System.out.println(null instanceof Circle);
        System.out.println(null instanceof Cylinder);
        System.out.println(null instanceof Object);

    }

    public static void PrintArea(Circle figure){
        System.out.println("Area is" + ((Circle)figure).calculateArea());
    }
}
