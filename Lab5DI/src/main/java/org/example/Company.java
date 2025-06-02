package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Company {

    private final Employee employee;

    // Внедряем через конструктор
    @Autowired
    public Company(@Qualifier("programmerBean") Employee employee) {
        this.employee = employee;
    }

    public void showPosition() {
        System.out.println("Employee role: " + employee.getPosition());
    }
}