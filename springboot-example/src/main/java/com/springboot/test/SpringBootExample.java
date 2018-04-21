package com.springboot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication 
@EnableConfigurationProperties(MailProperties.class)
public class SpringBootExample {  
    public static void main(String[] args) {  
        SpringApplication.run(SpringBootExample.class, args);  
    }  
}  
