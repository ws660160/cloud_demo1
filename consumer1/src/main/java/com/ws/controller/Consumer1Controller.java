package com.ws.controller;

import com.netflix.discovery.EurekaClient;
import com.ws.pojo.User;
import com.ws.service.TestService;
import com.ws.service.TestService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Consumer1Controller {
    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private TestService testService;
    @Autowired
    private TestService2 testService2;
    @GetMapping("/test1/{id}")
    public User test(@PathVariable String id){
        if(id.equals("2")){
            return  testService2.test(id);
        }
        return testService.test(id);
    }
}
