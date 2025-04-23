package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.ademo.pojo.MyNum;
import com.example.ademo.service.interfaces.IMyService;

@RestController
@RequestMapping("/my-controller")
public class MyController {

    private final IMyService myService;

    @Autowired
    public MyController(IMyService myService) {
        System.out.println("MyController || Constructor Invoked!!");
        this.myService = myService;
    }

    @PostMapping("/process")
    public String process(@RequestBody MyNum myNum) {
        System.out.println("Process() Invoked!! | myNum: " + myNum);

        try {
            throw new Exception("Exception thrown from process()");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("myService: " + myService);
        int sum = myService.add(myNum.getNum1(), myNum.getNum2());
        System.out.println("sum: " + sum);

        return "Process() Invoked!! Sum: " + sum;
    }
}
