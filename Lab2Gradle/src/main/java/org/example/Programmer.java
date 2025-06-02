package org.example;

public class Programmer extends Employee {
    public Programmer() {
        super("Ilya", 90000);
    }

    @Override
    public void work() {
        System.out.println(name + " Programmer. Salary:" + salary);
    }
}