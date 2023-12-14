package com.udacity.jwdnd.c1.review;


import org.springframework.stereotype.Service;

@Service
public class MessageService {

    String message;

    public MessageService(String message) {
        System.out.println("MessageService service created!");
        this.message = message;
    }

    public String uppercase() {
        return message.toUpperCase();
    }

    public String lowercase() {
        return message.toLowerCase();
    }
}
