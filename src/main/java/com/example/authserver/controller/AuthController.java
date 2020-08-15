package com.example.authserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/user")
    public ResponseEntity user(OAuth2Authentication oAuth2Authentication) {
        return ResponseEntity.ok(oAuth2Authentication);
    }

}
