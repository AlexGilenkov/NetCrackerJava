package com.netcracker.figures;

public class Rectangle implements IShape{

    private int length;
    private int width;
    private String color = "red";

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(int length, int width, String color) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public String getShapeName() {
        return "Rectangle";
    }
}
