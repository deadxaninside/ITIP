package org.example;

public class Main {
    public static void main(String[] args) {
        Employee admin = new Administrator("Иван", 35);
        Employee programmer = new Programmer("Анна", 28);
        Employee manager = new Manager("Сергей", 40);

        admin.work();
        programmer.work();
        manager.work();
    }
}