package com.deloitte.lab4.ex1;

public class Person {
    private String name;
    private float age;

    // Constructor
    public Person(String name, float age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}
