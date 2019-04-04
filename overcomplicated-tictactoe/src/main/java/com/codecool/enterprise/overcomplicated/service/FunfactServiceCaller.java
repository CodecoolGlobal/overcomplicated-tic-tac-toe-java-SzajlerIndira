package com.codecool.enterprise.overcomplicated.service;

import com.codecool.enterprise.overcomplicated.model.Funfact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class FunfactServiceCaller {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${funfact-url}/funfact")
    private String baseURL;

    public String getFunfact() {


        String body = restTemplate.getForEntity(baseURL, String.class).getBody();
        return body;
    }
}
