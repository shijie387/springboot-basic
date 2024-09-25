package com.atshijie.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootAutoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot3 Auto!";
    }
}
