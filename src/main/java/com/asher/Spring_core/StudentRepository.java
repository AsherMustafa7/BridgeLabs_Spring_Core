package com.asher.Spring_core;


import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Repository
public class StudentRepository {

    public StudentRepository() {
        System.out.println("StudentRepository constructor called");
    }
    public String getStudentName() {
        return "Asher Mustafa";
    }
    @PostConstruct 
    public void init() {
        System.out.println("StudentRepository initialized");
    }
    @PreDestroy 
    public void destroy() {
        System.out.println("StudentRepository destroyed");
    }
}