package com.example.greetingapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    private int id;
    private String content;

    public Greeting(int id, String message) {
        this.id = id;
        this.content = message;
    }
    public Greeting(){
    }
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return content;
    }

    public void setMessage(String message) {
        this.content = message;
    }
}
