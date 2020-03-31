package com.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Providerk1App {

    public static void main(String[] args) {
        SpringApplication.run(Providerk1App.class, args);
    }

}
