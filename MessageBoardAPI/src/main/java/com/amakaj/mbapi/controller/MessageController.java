package com.amakaj.mbapi.controller;

import com.amakaj.mbapi.model.Message;

import com.amakaj.mbapi.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        if (message.getMessageId() != 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "ID should not be provided");
        }

        return messageService.saveMessage(message);
    }
}
