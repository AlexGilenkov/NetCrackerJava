package com.netcracker;

import com.netcracker.figures.*;

import java.util.function.ObjDoubleConsumer;

public class Main {
    public static void main(String[] args){
        //Shape shape = new Shape(); not allowed

        Shape rectangle = new Rectangle(10, 20, "yellow");

        Shape triangle = new Triangle(10,20,"yellow");

        //System.out.println(rectangle.calculateArea());
        //System.out.println(triangle.calculateArea());

       Shape teremok = new Shape("black") {

           int base =20;
           int height = 30;
           @Override
           public double calculateArea() {
               return base*height + 0.5 * base*height;
           }
       } ;

        System.out.println(rectangle instanceof Rectangle);
        System.out.println(rectangle instanceof Triangle);
        System.out.println(rectangle instanceof Shape);

        System.out.println(triangle instanceof Rectangle);
        System.out.println(triangle instanceof Triangle);
        System.out.println(triangle instanceof Shape);

        System.out.println(teremok instanceof Rectangle);
        System.out.println(teremok instanceof Triangle);
        System.out.println(teremok instanceof Shape);

    }
}
