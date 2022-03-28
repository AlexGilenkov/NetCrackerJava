package com.netcracker.figures;

public interface IShape {

    double PI = 3.14;

    double calculateArea();

    default String getShapeName(){
        m();
        return "Figure";
    }

    private void m(){

    }

}
