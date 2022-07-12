package com.example.greetingapp.service;

import com.example.greetingapp.model.Greeting;
import com.example.greetingapp.repository.GreetingAppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {
    public String greetingMessage(){
        return "Hello World!";
    }

    @Autowired
    private GreetingAppRepository repository;
    public String greetingWithUserName(String firstName, String lastName) {
        if(firstName.isEmpty() && lastName.isEmpty())
            return greetingMessage();
        else if (!(firstName.equals("")) && (lastName.equals(""))) {
            return "Welcome to the greeting app, "+firstName;
        }
        else if (!(lastName.equals("")) && (firstName.equals(""))) {
            return "Welcome to the greeting app, "+lastName;
        }
        else
            return "Welcome to the greeting app, "+firstName+" "+lastName+"!";
    }

    public Greeting saveGreetings(Greeting greeting) {
        return repository.save(greeting);
    }

    public Greeting findGreetingById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    public List<Greeting> findGreetings() {
        return repository.findAll();
    }

    public Greeting editGreeting(Greeting greeting, Integer id) {
        Greeting existingGreeting = repository.findById(id).orElse(null);
        if (existingGreeting != null) {
            existingGreeting.setMessage(greeting.getMessage());
            return repository.save(existingGreeting);
        }else return null;
    }
}
