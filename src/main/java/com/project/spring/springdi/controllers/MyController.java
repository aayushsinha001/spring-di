package com.project.spring.springdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Welcome to Dependency Injection basics";
    }
}