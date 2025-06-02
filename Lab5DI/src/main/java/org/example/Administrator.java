package org.example;

import org.springframework.stereotype.Component;

@Component("adminBean")
public class Administrator implements Employee {
    @Override
    public String getPosition() {
        return "Administrator";
    }
}