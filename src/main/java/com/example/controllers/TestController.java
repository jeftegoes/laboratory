package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/books")
public class TestController {
    @GetMapping
    public String getBook() {
        return "Holy Bible!";
    }
}
