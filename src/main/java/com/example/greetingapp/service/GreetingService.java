package com.example.greetingapp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greetingMessage(){
        return "Hello World!";
    }
}