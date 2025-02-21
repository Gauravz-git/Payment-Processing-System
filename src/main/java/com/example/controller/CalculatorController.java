package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @PostMapping("/add-post")
    public int addPost(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }

    @GetMapping("/sub")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

    @GetMapping("/mul")
    public int multiply(@RequestParam int a, @RequestParam int b) {
        return a * b;
    }
}
