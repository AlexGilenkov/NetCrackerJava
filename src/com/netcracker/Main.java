package com.netcracker;

import com.netcracker.comparable.AgeCompatator;
import com.netcracker.person.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(35, "Ivan", "22203");
        Person p2 = new Person(25, "Petr", "22203");
        Person p3 = new Person(45, "Vasiliy", "22203");

        System.out.println(p1.compareTo(p2));

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        System.out.println("Before sorting:");
        personList.forEach(System.out::println);

        System.out.println("==============================");


        //Collections.sort(personList);
        //Collections.sort(personList, new AgeCompatator());
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });


        System.out.println("After sorting:");
        personList.forEach(System.out::println);

        System.out.println("============================");

        Collections.reverse(personList);

        System.out.println("After reverse:");
        personList.forEach(System.out::println);
    }

    static void printCollection(Collection<?> collection){


        for (Object object : collection) {
            System.out.println(object);
        }

    }

}
