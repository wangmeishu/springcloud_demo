package com.example.customer_feign.customer_feign.controller;


import com.example.customer_feign.customer_feign.service.CustomserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomserController {

    @Autowired
    CustomserService customserService;


    @RequestMapping("hello")
    public String hello(String name){
        return customserService.hello(name);
    }

}
