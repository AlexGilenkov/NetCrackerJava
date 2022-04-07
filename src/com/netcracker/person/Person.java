package com.netcracker.person;

public class Person {
    private int age;
    private String name;
    private String passport;
    private static int counter;


    public Person(int age, String name, String passport) {
        this.age = age;
        this.name = name;
        this.passport = passport;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Person)) return false;

        // if(obj == null || !(this.getClass().equals(obj.getClass()))) return false;

        Person person = (Person) obj;

        return this.age == person.age && this.name.equals(person.name)
                && this.passport.equals(person.passport);
    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31*result+ age;
        result = 31*result + passport.hashCode();
        result = 31*result + name.hashCode();

        return result;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPassport() {
        return passport;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }


    public static void m(int x, int y){

    }

    public static void m(int x, int y, int z){

    }

    public static void staticMethod(){
        counter++;
        anotherStaticMethod();
        // Нельзя вызвать нестатичные методы
        // age++;
        // nonStaticMethod();

    }

    public static void anotherStaticMethod(){

    }

    public void nonStaticMethod(){
        counter++;
        age++;
        anotherStaticMethod();
        nonStaticMethod();
        staticMethod();

    }

}
