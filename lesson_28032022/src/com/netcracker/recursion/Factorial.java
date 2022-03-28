package com.netcracker.recursion;

public abstract class Factorial {
    public static int factorial(int n){
        int result=1;
        for (int i=2;i<=n;i++){
            result *=i;
        }
        return result;
    }

    public static int factorialR(int n){
        if(n<0) return -1;
        if(n<=1) return n;
        return n * factorialR(n-1);
    }
}
