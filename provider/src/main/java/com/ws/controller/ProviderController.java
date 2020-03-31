package com.ws.controller;

import com.ws.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProviderController {
//
//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/test/{id}")
    public User test(@PathVariable String id){
       User user=new User();
       user.setId(id);
       user.setName("ws");
       return  user;
    }

    @GetMapping("/fuck")
    public String  a(){
        return "a";
    }
}
