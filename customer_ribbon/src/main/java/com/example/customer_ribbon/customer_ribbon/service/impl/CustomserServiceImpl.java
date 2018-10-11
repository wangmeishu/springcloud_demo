package com.example.customer_ribbon.customer_ribbon.service.impl;

import com.example.customer_ribbon.customer_ribbon.service.CustomserService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomserServiceImpl implements CustomserService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello(String name) {
        return restTemplate.getForObject("http://PROVIDER/hi?name=" + name, String.class);
    }

    @Override
    public String helloError(String name) {
        return "hi,"+name+",sorry,error!";
    }


}
