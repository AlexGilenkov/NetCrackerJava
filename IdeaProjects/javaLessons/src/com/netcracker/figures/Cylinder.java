package com.netcracker.figures;

public class Cylinder extends Circle {
    private double height = 1.0d;

    public Cylinder() {}

    public Cylinder(double height) {
        this.height = height;
    }


    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double baseSquare = 2 * super.calculateArea();
        double sideSquare = 2*Math.PI * height * super.getRadius();

        return baseSquare + sideSquare;
    }

    public double calculateVolume(){
        return super.calculateArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder{"+"Base:" + super.toString() +"height=" + height +"}";
    }

    //=================================================================
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
