package com.netcracker.person;


public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(22, "Ivan", "2283");
        Person p2 = new Person(22, "Ivan", "2283");

        /*
        Bad style!!!
        System.out.println(p1.counter);
        System.out.println(p2.counter);
        */

        System.out.println(Person.getCounter());
        Person.setCounter(36267);
        System.out.println(Person.getCounter());




    }
}
