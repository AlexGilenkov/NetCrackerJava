package com.netcracker;

public class Main {
    public static void main(String[] args) {
        Outer outer = new Outer(1);

        outer.displayIncrementNumber();

        //non static nested class ==> Inner class
        Outer.Inner inner = outer.new Inner();

        System.out.println(inner.PI);
        System.out.println(inner.incrementNumber(25));

    }
}
