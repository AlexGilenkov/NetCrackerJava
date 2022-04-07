package com.netcracker.generics;

public class Gen<T> {

    private T value;

    public Gen(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void showType(){
        System.out.println("The type is " +
                value.getClass().getName());
    }
}
