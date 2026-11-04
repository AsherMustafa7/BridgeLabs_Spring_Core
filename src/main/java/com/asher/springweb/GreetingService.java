package com.asher.springweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository repository;

    public GreetingService(GreetingRepository repository) {
        this.repository = repository;
    }
    
    public String generateGreeting() {
        return repository.getGreeting()
                + "\nWelcome to Spring Core with Tomcat.";
    }
}