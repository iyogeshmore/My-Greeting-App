package com.example.greetingapp.repository;

import com.example.greetingapp.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingAppRepository extends JpaRepository<Greeting, Integer> {
}
