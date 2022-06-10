package com.netcracker.figures;

import java.io.Serializable;

public class Circle implements Serializable {

    private double radius = 1.0d;
    private String color = "blue";
    private transient String password;



    public Circle(){}
    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public Circle(double radius, String color, String password) {
        this.radius = radius;
        this.color = color;
        this.password = password;
    }

    public double calculateArea() {
        return Math.pow(radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
//===================================================================
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
