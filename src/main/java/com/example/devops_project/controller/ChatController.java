package com.example.devops_project.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ChatController {

    @RequestMapping("/chat")
    public String chat() {
        System.out.println("the chat bot is running");
        return "working";
    }
}
