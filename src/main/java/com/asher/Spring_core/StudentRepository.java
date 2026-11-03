package com.asher.Spring_core;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String getStudentName() {
        return "Asher Mustafa";
    }
}