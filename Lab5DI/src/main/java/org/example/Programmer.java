package org.example;

import org.springframework.stereotype.Component;

@Component("programmerBean")
public class Programmer implements Employee {
    @Override
    public String getPosition() {
        return "Programmer";
    }
}