package org.example;

public class Administrator extends Employee {
    public Administrator(String name, int age) {
        super(name, age, "Администратор");
    }

    @Override
    public void work() {
        System.out.println(name + "," + age + "," + "Администратор");
    }
}