package com.example.controller;

import org.springframework.web.bind.annotation.*;
import com.example.ademo.pojo.MyNum;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@RestController
@ResponseBody
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

        System.out.println("Running myMethodpost(): " + param1 + " + " + param2 + " + " + pv1 + " + " + pv2 + " + " + pv3 + " + " + requestBody);

        // Convert JSON using Jackson
        MyNum reqAsObjViaJackson = convertJsonToMyNum(requestBody);
        System.out.println("reqAsObj: " + reqAsObjViaJackson);

        // Convert JSON using Gson
        MyNum reqAsObjViaGson = convertJsonToMyNumUsingGson(requestBody);
        System.out.println("reqAsObjViaGson: " + reqAsObjViaGson);

        return "Hello World-post|param1:" + param1 + "|param2:" + param2
                + "|pv1:" + pv1 + "|pv2:" + pv2 + "|pv3:" + pv3
                + "\n|requestBody:\n" + requestBody;
    }

    @GetMapping("/myMethod2")
    public String myMethod2() {
        System.out.println("Running myMethod2()");
        return "Hello World2 - response value";
    }


    public static MyNum convertJsonToMyNum(String json) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(json, MyNum.class);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Convert JSON string to MyNum object using Gson
    public static MyNum convertJsonToMyNumUsingGson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, MyNum.class);
    }
}