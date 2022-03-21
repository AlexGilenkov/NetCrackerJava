package com.netcracker.figures;

public class Triangle implements IShape{

    private int base;
    private int height;
    private String color = "red";

    public Triangle(int base, int height, String color){
        this.color = color;
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (base*height)/2;
    }
}
