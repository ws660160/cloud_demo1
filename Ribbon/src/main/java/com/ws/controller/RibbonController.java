package com.ws.controller;

import com.netflix.discovery.EurekaClient;
import com.ws.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {
    @Autowired
    private EurekaClient eurekaClient;
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/Ribbon/{id}")
    public User test(@PathVariable String id){
        return restTemplate.getForObject("http://PROVIDER-SERVICE/test/"+id,User.class);
    }
}
