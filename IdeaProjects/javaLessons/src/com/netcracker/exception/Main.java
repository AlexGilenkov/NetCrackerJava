package com.netcracker.exception;

public class Main {
    public static void main(String[] args){
        System.out.println("Main.main");

        int salary = -10;

        assert salary > 0 : "Negative salary!";

    }

    static void methD(String str){
        if(str == null)
            throw new NullPointerException("String has null value");
    }

    static void methA() {
        System.out.println("Main.methA");
        methB();
    }
    static void methB() {
        System.out.println("Main.methB");
        try {
            methC("");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    static void methC(String str) throws InterruptedException {
        System.out.println("Main.methC");

        if(str.length() == 0){
            throw new InterruptedException();
        }
    }
}
