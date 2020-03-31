package com.ws.controller;

import com.ws.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider1Controller {
//
//    @Autowired
//    private RestTemplate restTemplate;

    @GetMapping("/test/{id}")
    public User test(@PathVariable String id){
       User user=new User();
       user.setId(id);
       user.setName("zs");
       return  user;
    }

    @GetMapping("/fuck")
    public String  a(){
        return "a";
    }
}
