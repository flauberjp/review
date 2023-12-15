package com.udacity.jwdnd.c1.review;


import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    String message;

    public MessageService(String message) {
        this.message = message;
    }

    public String uppercase() {
        return message.toUpperCase();
    }

    public String lowercase() {
        return message.toLowerCase();
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("MessageService service created!");
    }
}
