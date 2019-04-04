package com.codecool.comicsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
@EnableEurekaClient
public class ComicsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicsServiceApplication.class, args);
    }

    @Bean
    public Random random(){
        return new Random();
    }

}
