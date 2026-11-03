package com.asher.Spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Create the Spring IoC Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve StudentService bean
        StudentService service =
                context.getBean(StudentService.class);

        // Execute business logic
        service.displayStudent();

        // Close the container
        context.close();
    }
}