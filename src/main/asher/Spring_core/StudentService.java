package com.asher.servlet.Spring_core;

public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public void displayStudent() {
        String name = repository.getStudentName();

        System.out.println("Student Name: " + name);
    }
}