package org.example;

import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void showJobTitles() {
        for (Employee employee : employees) {
            System.out.println("Employee: " + employee.getJobTitle());
        }
    }
}