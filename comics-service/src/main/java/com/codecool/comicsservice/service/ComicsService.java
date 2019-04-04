package com.codecool.comicsservice.service;

import com.codecool.comicsservice.model.ComicsModel;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

@Service
public class ComicsService {

    @Autowired
    Random random;


    public String generateRandomComicUrl() {
        String baseUrl = "https://xkcd.com/"+ (random.nextInt(1929) + 1) + "/info.0.json";
        return baseUrl;
    }

    public ComicsModel getComic() {
        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLHostnameVerifier(new NoopHostnameVerifier())
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory;
        requestFactory = new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);

        ComicsModel body = restTemplate.getForObject(generateRandomComicUrl(), ComicsModel.class);
        return body;
    }

}