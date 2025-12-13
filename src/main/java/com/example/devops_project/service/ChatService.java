package com.example.devops_project.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String generateReply(String message) {
        return "You said: " + message;
    }
}
