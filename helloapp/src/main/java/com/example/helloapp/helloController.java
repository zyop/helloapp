package com.example.helloapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/")
    public String hello(){
        return "Hello Spring!";
    }
    @RequestMapping("/bye")
    public String bye(){
        return "Good Bye Spring!";
    }
    @RequestMapping("/Fariz")
    public String getCustomerFariz(){
        Customer a = new Customer(3, "Fariz", "082123565877", "021");
        return a.toString();
    }
}