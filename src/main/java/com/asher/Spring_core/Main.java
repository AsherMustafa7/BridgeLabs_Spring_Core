package com.asher.Spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main class is loaded");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Application context is loaded");
        StudentService service =
                context.getBean(StudentService.class);
        System.out.println("Student service is loaded");
        service.displayStudent();

        context.close();
    }
}