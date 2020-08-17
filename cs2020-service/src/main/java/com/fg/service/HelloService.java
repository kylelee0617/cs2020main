package com.fg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fg.dao.HelloDao;

@Service
public class HelloService {
	
	@Autowired
	HelloDao dao;
	
    public String getHello() {
        return "helloService / " + dao.getHelloDao();
    }
}