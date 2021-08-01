package com.example.demo3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/")
    public String test1() {
        System.out.println("In Test Function");
        return "Hello World";
    }
}
