package com.asher.Spring_core;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void displayStudent() {
        System.out.println(
            "Student Name: " + repository.getStudentName()
        );
    }
}