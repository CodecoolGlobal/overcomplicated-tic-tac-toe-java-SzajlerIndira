package com.codecool.enterprise.overcomplicated.service;

import com.codecool.enterprise.overcomplicated.model.Avatar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AvatarServiceCaller {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${avatar-url}")
    private String baseURL;

    public String getAvatarUri(String sessionId) {
        String url = baseURL + "/avatar/" + sessionId;
        Avatar body = restTemplate.getForEntity(url, Avatar.class).getBody();
        log.info("avatar uri = " + body.getImageURI());
        return body.getImageURI();
    }
}
