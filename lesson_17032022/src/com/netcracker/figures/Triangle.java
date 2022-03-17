package com.netcracker.figures;

public class Triangle extends Shape{

    private int base;
    private int height;

    public Triangle(int base, int height, String color){
        super(color);
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
