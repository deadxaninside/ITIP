package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Administrator admin = context.getBean(Administrator.class);
        Programmer prog = context.getBean(Programmer.class);
        Manager manager = context.getBean(Manager.class);

        System.out.println("Сотрудник 1: " + admin.getPosition());
        System.out.println("Сотрудник 2: " + prog.getPosition());
        System.out.println("Сотрудник 3: " + manager.getPosition());

        context.close();
    }
}