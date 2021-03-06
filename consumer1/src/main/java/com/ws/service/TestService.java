package com.ws.service;

import com.ws.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("PROVIDER-SERVICE")
public interface TestService {

    @GetMapping("/test/{id}")
    public User test(@PathVariable String id);
}
