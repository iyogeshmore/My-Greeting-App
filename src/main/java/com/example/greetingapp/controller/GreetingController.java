package com.example.greetingapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {
    public static final String template = "Welcome to the greeting app, %s";
    @RequestMapping ("/query/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam(@RequestParam(value = "name") String name)
    {
        return "Hello " + name + "!";
    }
}
