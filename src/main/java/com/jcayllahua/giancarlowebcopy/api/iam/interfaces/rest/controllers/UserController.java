package com.jcayllahua.giancarlowebcopy.api.iam.interfaces.rest.controllers;

import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/users", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Users", description = "User Management Endpoints")
public class UserController {
    @GetMapping
    public ResponseEntity<String> getUsers() {
        String jsonString = "{\"response\": \"List of users\"}";

        return ResponseEntity.ok(jsonString);
    }
}
