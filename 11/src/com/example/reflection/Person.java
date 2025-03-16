package com.example.reflection;
public class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter și setter pentru name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter și setter pentru age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Metodă pentru a afisa detalii
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
