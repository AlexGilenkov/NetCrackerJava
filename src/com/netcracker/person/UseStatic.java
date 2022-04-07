package com.netcracker.person;

class UseStatic {
    static  int a = 3;
    static  int b;

    static void meth(int x) {
        System.out.println("UseStatic.meth");
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static  {
        // Working before main()!!!
        System.out.println("Static block initialized.");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println("UseStatic.main");
        meth(42);
    }
}
