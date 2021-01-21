package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMsg {


    @GetMapping("/msg")
    public String  getMsg(){

        return "Hello Jenkins";

    }
}
