package com.codecool.avatarservice.controller;

import com.codecool.avatarservice.service.AvatarService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

@RestController
@RequestMapping
public class AvatarServiceController {
    @Autowired
    private AvatarService avatarService;


    @GetMapping("/avatar/{sessionId}")
    public Avatar makeAvatar( @PathVariable("sessionId") String sessionId){
        return new Avatar(
                avatarService.makeAvatarURI(sessionId));
    }

    @Data
    @AllArgsConstructor
    public class Avatar {
        String imageURI;

    }
}
