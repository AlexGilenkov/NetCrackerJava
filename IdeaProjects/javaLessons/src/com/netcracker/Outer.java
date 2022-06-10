package com.netcracker;

public class Outer {

    private static int number;
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

    public static class Inner {
        public static final double PI = 3.14d;


        public int incrementNumber(int value){
            staticMethod();
            // nonStaticMethod();
            counter++;
            return ++value;
        }

        public static void innerStaticMethod(){

        }

        public int incrementNumber(){
            return ++number;
        }

    }


    public void displayIncrementNumber(){
        Inner inner = new Inner();

        inner.incrementNumber(number);

        System.out.println(number);
    }


}
