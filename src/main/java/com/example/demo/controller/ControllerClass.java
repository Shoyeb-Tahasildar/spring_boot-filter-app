package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {


    @GetMapping("/")
    public String returnHello(){
        return "Hello world from spring boot";
    }
}
