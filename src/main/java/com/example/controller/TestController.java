package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ademo.pojo.MyNum;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/test")
public class TestController {

        @PostMapping("/myMethod-post/{pv1}/{pv2}/{pv3}")
        public String myMethodpost(
            @RequestParam(required = false) String param1, 
            @RequestParam(required = false) String param2,
            @PathVariable String pv1,
            @PathVariable String pv2,
            @PathVariable String pv3,
            @RequestBody String requestBody) {

            System.out.println("Running myMethodMPost()" + param1 + " + " + param2 + " + " + pv1 + " + " + pv2 + " + " + pv3 + " + " + requestBody);
            
            MyNum reqAsObj = convertJsonToMyNum(requestBody);
            System.out.println("reqAsObj:" + reqAsObj);

            return "Hello World-post|param1:" + param1 + "|param2:" + param2 + "|pv1:" + pv1 + "|pv2:" + pv2 + "|pv3:" + pv3 + "\n|requestBody:\n" + requestBody + "\n|reqAsObj:" + reqAsObj;   
            

            
                
        }

        @GetMapping("/myMethod2")
        public String myMethod2() {
            System.out.println("Running myMethod()");
                return "Hello World2";
        }
        
        
        // Method to convert JSON string to MyNum object
    public static MyNum convertJsonToMyNumUsingGson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, MyNum.class); 
    }
}
