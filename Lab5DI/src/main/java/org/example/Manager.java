package org.example;

import org.springframework.stereotype.Component;

@Component("managerBean")
public class Manager implements Employee {
    @Override
    public String getPosition() {
        return "Manager";
    }
}