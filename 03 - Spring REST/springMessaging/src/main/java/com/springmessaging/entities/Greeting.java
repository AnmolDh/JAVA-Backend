package com.springmessaging.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.atomic.AtomicLong;

@Getter
@Setter
public class Greeting {
    private final static AtomicLong counter = new AtomicLong();
    private long id;
    private String message;

    public Greeting(String message) {
        this.id = counter.incrementAndGet();
        this.message = message;
    }
}
