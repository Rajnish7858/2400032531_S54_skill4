package com.klu.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Constructor Injection via annotation
    @Bean
    public Student studentCI() {
        return new Student(201, "Charlie", "Electronics", 1);
    }

    // Setter Injection via annotation
    @Bean
    public Student studentSI() {
        Student s = new Student(202, "Diana", "placeholder", 0);
        s.setCourse("Mechanical Engineering");
        s.setYear(4);
        return s;
    }
}
