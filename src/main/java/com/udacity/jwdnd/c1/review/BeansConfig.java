package com.udacity.jwdnd.c1.review;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    public MessageService messageService;

    public BeansConfig(MessageService messageService) {
        System.out.println("BeanConfig configuration created!");
        this.messageService = messageService;
    }


    @Bean
    public String uppercaseMessage() {
        System.out.println("uppercaseMessage bean created!");
        return messageService.uppercase();
    }

    @Bean
    public String lowercaseMessage() {
        System.out.println("lowercaseMessage bean created!");
        return messageService.lowercase();
    }
}
