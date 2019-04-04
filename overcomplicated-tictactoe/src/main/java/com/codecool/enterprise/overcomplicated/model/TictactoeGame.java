package com.codecool.enterprise.overcomplicated.model;

import com.codecool.enterprise.overcomplicated.service.AvatarServiceCaller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TictactoeGame {
    @Autowired
    private AvatarServiceCaller avatarServiceCaller;
}
