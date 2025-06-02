package org.example;

public class Employee {
    protected String name;
    protected int age;
    protected String position;

    public Employee(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void work() {
        System.out.println(name + position);
    }
}