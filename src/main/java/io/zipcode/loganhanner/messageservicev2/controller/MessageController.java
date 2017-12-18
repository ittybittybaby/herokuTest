package io.zipcode.loganhanner.messageservicev2.controller;

import io.zipcode.loganhanner.messageservicev2.MessageService;
import io.zipcode.loganhanner.messageservicev2.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/messages/")
    public Iterable<Message> getAllByUser(long userId) {
        return messageService.getAllByUserId(userId);
    }

    @GetMapping("/messages/{messageId}/")
    public Message getMessage(@PathVariable long messageId) {
        return messageService.getMessage(messageId);
    }

    @PostMapping("/messages/")
    public ResponseEntity<Void> createMessage(Message message) {
        boolean created =  messageService.addMessage(message);

        if(!created) {
            return ResponseEntity.noContent().build();
        }
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{messageId}").buildAndExpand(message.getMessageId()).toUri();
        return ResponseEntity.created(location).build();
    }

    @PutMapping("/messages/{messageId}/")
    public ResponseEntity updateMessage(@PathVariable long messageId, Message message) {
        boolean updated = messageService.updateMessage(messageId, message);

        if(!updated) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/messages/{messageId}")
    public ResponseEntity deleteMessage(@PathVariable long messageId) {
        boolean deleted = messageService.deleteMessage(messageId);

        if(!deleted) {
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok().build();
    }

}


