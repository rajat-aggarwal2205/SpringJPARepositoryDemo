package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @RequestMapping("/hello")
    public String sayHello()
    {
        return "hello world spring boot";
    }

}
