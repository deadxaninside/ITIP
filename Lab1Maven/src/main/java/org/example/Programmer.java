package org.example;

public class Programmer extends Employee {
    public Programmer(String name, int age) {
        super(name, age, "Программист");
    }

    @Override
    public void work() {
        System.out.println(name + "," + age + "," + "Программист");
    }
}