package com.namest504.deploytest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${TEST_STRING}")
    private String TEST_STRING;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/String")
    public String hello2() {
        return TEST_STRING;
    }
}
