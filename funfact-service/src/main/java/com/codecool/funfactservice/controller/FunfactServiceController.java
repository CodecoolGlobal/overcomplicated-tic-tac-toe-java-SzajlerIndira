package com.codecool.funfactservice.controller;

import com.codecool.funfactservice.service.FunfactService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class FunfactServiceController {
    @Autowired
    private FunfactService funfactService;

    @GetMapping("/funfact")
    public String getFunfact() {
        return funfactService.getFunfact();
    }

}
