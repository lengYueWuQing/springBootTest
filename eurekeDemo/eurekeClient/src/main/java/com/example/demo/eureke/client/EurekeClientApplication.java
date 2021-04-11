package com.example.demo.eureke.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekeClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekeClientApplication.class, args);
    }

}
