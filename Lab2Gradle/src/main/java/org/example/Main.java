package org.example;

public class Main {
    public static void main(String[] args) {
        Employee admin = new Administrator();
        Employee programmer = new Programmer();
        Employee manager = new Manager();

        admin.work();
        programmer.work();
        manager.work();
    }
}