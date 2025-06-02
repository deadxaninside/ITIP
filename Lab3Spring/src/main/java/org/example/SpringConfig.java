package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public Administrator administrator() {
        return new Administrator();
    }

    @Bean
    public Programmer programmer() {
        return new Programmer();
    }

    @Bean
    public Manager manager() {
        return new Manager();
    }
}