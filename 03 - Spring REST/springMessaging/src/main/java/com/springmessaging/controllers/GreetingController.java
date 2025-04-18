package com.springmessaging.controllers;

import com.springmessaging.entities.Greeting;
import com.springmessaging.services.GreetingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/simple")
    public ResponseEntity<String> simpleGreeting() {
        return new ResponseEntity<>(greetingService.getSimpleGreeting(), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<Greeting> getGreeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new ResponseEntity<>(
                new Greeting(counter.incrementAndGet(), String.format(template, name)),
                HttpStatus.OK
        );
    }
}
