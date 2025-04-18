package com.springmessaging.services;

import com.springmessaging.entities.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public Greeting getSimpleGreeting(){
        return new Greeting("Hello World");
    }

    public Greeting getGreeting(String firstName, String lastName) {
        return new Greeting(("Hello " + firstName + " " + lastName).trim());
    }
}
