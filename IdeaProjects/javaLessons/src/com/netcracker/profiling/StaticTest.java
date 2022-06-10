package com.netcracker.profiling;

import java.util.ArrayList;
import java.util.List;

public class StaticTest {

    public static List<Double> list = new ArrayList<Double>();

    public void populateList(){
        for( int i=0; i<Integer.MAX_VALUE; i++){
            if(i%1000 == 0)
                System.gc();
            double d = Math.random();
            System.out.println(d);
           list.add(d);

        }
        System.out.println("debug 2");
    }


    public static void main(String[] args) {

        System.out.println("Debug 1");
        StaticTest test = new StaticTest();
        test.populateList();


    }


}
