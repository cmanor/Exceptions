package org.example;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        if (age<=0 || age >=120){
            throw new IllegalArgumentException("age must be between 0 and 120");
        }if (name == null || name.isEmpty() || name.length()>40){
            throw new IllegalArgumentException("try again");
        }
        this.age = age;
        this.name = name;
    }
}
