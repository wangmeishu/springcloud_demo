package com.example.customer_ribbon.customer_ribbon.controller;

import com.example.customer_ribbon.customer_ribbon.service.CustomserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired
    CustomserService customserService;

    @RequestMapping("hello")
    public String hello(String name){
        return customserService.hello(name);
    }
}
