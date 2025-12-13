package com.example.devops_project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChatController {

    @RequestMapping("/ping")
    public String ping() {
        return "pong";
    }
}
