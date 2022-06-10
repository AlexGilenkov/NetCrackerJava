package com.netcracker.lambda.math;

public class MathOperator {

    public static double performOperation(double a, double b, MathOperation mathOperation){
        return mathOperation.operate(a, b);
    }

}
