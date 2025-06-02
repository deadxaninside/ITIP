package org.example;

public class Manager extends Employee {
    public Manager(String name, int age) {
        super(name, age, "Менеджер");
    }

    @Override
    public void work() {
        System.out.println(name + "," + age + "," + "Менеджер");
    }
}