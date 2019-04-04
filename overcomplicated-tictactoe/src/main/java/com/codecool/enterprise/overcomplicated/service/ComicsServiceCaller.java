package com.codecool.enterprise.overcomplicated.service;

import com.codecool.enterprise.overcomplicated.model.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ComicsServiceCaller {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${comic-url}/comic")
    private String baseUrl;

    public Comic addComic() {
        Comic body = restTemplate.getForEntity(baseUrl, Comic.class).getBody();
        return body;
    }
}
