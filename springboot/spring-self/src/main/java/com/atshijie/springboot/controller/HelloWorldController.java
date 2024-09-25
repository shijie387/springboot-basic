package com.atshijie.springboot.controller;

import com.atshijie.springboot.properties.DataSourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller + @ResponseBody
@RestController
@EnableConfigurationProperties(DataSourceProperties.class)
public class HelloWorldController {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("dataSourceProperties = " + dataSourceProperties);
        return "Hello Spring Boot3!";
    }
}
