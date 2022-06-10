package com.netcracker;

import com.netcracker.figures.*;

public class Main {
    public static void main(String[] args){

       Circle b = new Circle(10.2, "black");
       passMethod(b);

        System.out.println(b);

    }

    public static void passMethod(Circle circle){
        circle.setRadius(100.500);
        circle.setColor("green");

        circle = new Circle(200.500, "Indigo");
    }

}
