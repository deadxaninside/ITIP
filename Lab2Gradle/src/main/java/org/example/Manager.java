package org.example;

public class Manager extends Employee {
    public Manager() {
        super("Ivan", 60000);
    }

    @Override
    public void work() {
        System.out.println(name + " Manager. Salary:" + salary );
    }
}