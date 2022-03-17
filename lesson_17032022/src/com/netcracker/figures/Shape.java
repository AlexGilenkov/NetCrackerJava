package com.netcracker.figures;

public abstract class Shape {
    private String color = "red";

    public abstract double calculateArea();

    public Shape(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void m(){
        System.out.println("Shape.m");
    }


    public String getColor() {
        return color;
    }
}
