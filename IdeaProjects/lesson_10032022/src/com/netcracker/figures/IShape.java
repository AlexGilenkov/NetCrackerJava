package com.netcracker.figures;

public interface IShape extends I1, I2{

    double PI = 3.14;

    double calculateArea();

    default String getShapeName(){
        m();
        return "Figure";
    }

    private void m(){

    }


}
