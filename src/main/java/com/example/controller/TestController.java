package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping("/test")
public class TestController {

        @PostMapping("/myMethod-post/{pv1}/{pv2}/{pv3}")
        public String myMethodpost(
            @RequestParam(required = false) String param1, 
            @RequestParam(required = false) String param2,
            @PathVariable String pv1,
            @PathVariable String pv2,
            @PathVariable String pv3) {

            System.out.println("Running myMethod()" + param1 + " " + param2);
                return "Hello World - post" + param1 + " " + param2;
        }

        @GetMapping("/myMethod2")
        public String myMethod2() {
            System.out.println("Running myMethod()");
                return "Hello World2";
        }
}
