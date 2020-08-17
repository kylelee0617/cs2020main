package com.fg.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fg.service.HelloService;

@RestController
public class HelloController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String getHello() {
        System.out.println("System hello");
        logger.info("log info");
        logger.error("log error");
        
        return helloService.getHello();
    }

}