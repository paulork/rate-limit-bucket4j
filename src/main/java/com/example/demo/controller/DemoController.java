package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("hello")
    public String teste() {
        return "Hello, TESTE!!!";
    }

    @GetMapping("hell0")
    public String teste1() {
        return "Hello, TESTE 2!!";
    }

}
