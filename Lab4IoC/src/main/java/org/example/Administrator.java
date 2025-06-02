package org.example;

import org.springframework.stereotype.Component;

@Component("administratorBean")
public class Administrator implements Employee {
    @Override
    public String getJobTitle() {
        return "Administrator";
    }
}