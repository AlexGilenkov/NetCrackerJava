package com.netcracker;

import com.netcracker.wildcard.A;
import com.netcracker.wildcard.B;
import com.netcracker.wildcard.C;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<A> aList = new ArrayList<>();
        aList.add(new A());


        List<B> bList = new ArrayList<>();
        bList.add(new B());

        List<C> cList = new ArrayList<>();
        cList.add(new C());

        List<Object> objectList = new ArrayList<>();
        objectList.add("hello world!");

        printCollection(aList);
        printCollection(bList);
        printCollection(cList);
        printCollection(objectList);

    }

    static void printCollection(Collection<?> collection){


        for (Object object : collection) {
            System.out.println(object);
        }

    }

}
