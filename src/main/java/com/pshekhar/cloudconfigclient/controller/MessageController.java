package com.pshekhar.cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RefreshScope
public class MessageController {

    @Autowired
    private Environment env;

    @GetMapping(value = "message")
    public Mono<ResponseEntity<String>> getMessage() {
        return Mono.just(ResponseEntity
                .ok()
                .contentType(MediaType.TEXT_PLAIN)
                .body("App: " + env.getProperty("app.message") + "\nRCS: " + env.getProperty("rcs.message")));
    }
}
