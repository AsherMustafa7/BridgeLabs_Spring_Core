package com.asher.Spring_core;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public StudentRepository studentRepository() {
        return new StudentRepository();
    }

    @Bean
    public StudentService studentService(
            StudentRepository repository) {

        return new StudentService(repository);
    }
}