package com.codecool.avatarservice.service;

import org.springframework.stereotype.Service;

@Service
public class AvatarService {
    public String makeAvatarURI(String sessionId) {
        String URI= "https://robohash.org/" + sessionId + ".png";
        return URI;

    }
}
