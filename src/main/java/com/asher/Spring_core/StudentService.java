package com.asher.Spring_core;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
        System.out.println("StudentService constructor called");
    }

    @PostConstruct
    public void init() {
        System.out.println("StudentService initialized");
    }

    public void displayStudent() {
        System.out.println(
            "Student Name: " + repository.getStudentName()
        );
    }

    @PreDestroy
    public void destroy() {
        System.out.println("StudentService destroyed");
    }
}