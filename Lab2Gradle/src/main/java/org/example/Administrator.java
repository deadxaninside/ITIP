package org.example;

public class Administrator extends Employee {
    public Administrator() {
        super("Anna", 50000);
    }

    @Override
    public void work() {
        System.out.println(name + " Administrator.  Salary:" + salary);
    }
}