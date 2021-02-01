package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoMsg {

    @GetMapping("/msg")
    public String getMsg() {
        return "Hello Jenkins";
    }

    @GetMapping("/jenkins")
    public  String getJenkis(){
        return "Running jenkins";
    }
}



