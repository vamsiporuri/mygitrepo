package com.springboot.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Autowired
	MailProperties properties;

	@RequestMapping("/hello")  
    public String hello(){  
		System.out.println(properties.getHost());
        return"Hello!";  
    }  
}
