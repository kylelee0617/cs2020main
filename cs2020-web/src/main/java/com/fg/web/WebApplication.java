package com.fg.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.fg", exclude = DataSourceAutoConfiguration.class)
public class WebApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebApplication.class, args);

    }

}