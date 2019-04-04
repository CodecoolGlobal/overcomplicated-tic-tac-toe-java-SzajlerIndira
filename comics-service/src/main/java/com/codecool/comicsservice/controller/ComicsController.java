package com.codecool.comicsservice.controller;

import com.codecool.comicsservice.model.ComicsModel;
import com.codecool.comicsservice.service.ComicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ComicsController {

    @Autowired
    private ComicsService comicsService;

    @GetMapping(value = "/comic")
    public ComicsModel randomComic() {
        return comicsService.getComic();
    }

}