package com.codecool.enterprise.overcomplicated.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Avatar {
    private String imageURI;
    private String sessionId;
}
