package com.example.customer_feign.customer_feign.service.hystric;

import com.example.customer_feign.customer_feign.service.CustomserService;
import org.springframework.stereotype.Component;

@Component
public class CustomserServiceHtstric implements CustomserService {
    @Override
    public String hello(String name) {
        return "sorry "+name;
    }
}
