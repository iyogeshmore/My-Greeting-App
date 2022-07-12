package com.example.greetingapp.controller;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    public static final String template = "Welcome to the greeting app, %s";
    public final AtomicLong counter = new AtomicLong();
    @Autowired
    public GreetingService service;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "User") String name){
        return new Greeting((int) counter.incrementAndGet(), String.format(template, name));
    }
    @RequestMapping("/welcome")
    public String displayMessage(){
        return service.greetingMessage();
    }
}
