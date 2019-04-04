package com.codecool.funfactservice.service;

import com.codecool.funfactservice.controller.FunfactServiceController;
import com.codecool.funfactservice.model.Funfact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class FunfactService  {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${cat-fact-url}")
    private String baseURL;


    public String getFunfact() {
//
        Funfact body = restTemplate.getForEntity(baseURL, Funfact.class).getBody();

        assert body != null;
        return body.getFact();

    }
}
