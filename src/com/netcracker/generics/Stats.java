package com.netcracker.generics;

public class Stats<T extends Number> {

    private T[] values;

    public Stats(T[] values) {
        this.values = values;
    }

    public double calculateAvg(){
        double result = 0;

        for (Number value:values) {
            result += value.doubleValue();
        }

        return result/values.length;
    }
}
