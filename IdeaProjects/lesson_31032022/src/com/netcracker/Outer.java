package com.netcracker;

public class Outer {

    private int number;
    private static int counter;

    public Outer(int number) {
        this.number = number;
    }

    public Outer() {
    }

    static void staticMethod(){

    }

    void nonStaticMethod(){

    }

    public class Inner {
        public final double PI = 3.14d;


        public int incrementNumber(int value){
            staticMethod();
            nonStaticMethod();
            counter++;
            return ++value;
        }
    }

    public void displayIncrementNumber(){
        Inner inner = new Inner();

        inner.incrementNumber(number);

        System.out.println(number);
    }


}
