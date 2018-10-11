package com.example.customer_feign.customer_feign.service;

import com.example.customer_feign.customer_feign.service.hystric.CustomserServiceHtstric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "provider", fallback = CustomserServiceHtstric.class)
public interface CustomserService {

    @RequestMapping(value = "/hi")
    String hello(@RequestParam(value = "name") String name);

}
