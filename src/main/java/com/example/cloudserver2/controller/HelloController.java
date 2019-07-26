package com.example.cloudserver2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return "hello "+name+"，this is first messge";
    }
}
