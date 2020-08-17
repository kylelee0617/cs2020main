package com.fg.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fg.service.HelloService;

@RestController
public class HelloController extends BaseController {
	
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