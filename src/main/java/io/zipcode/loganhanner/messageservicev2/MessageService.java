package io.zipcode.loganhanner.messageservicev2;

import io.zipcode.loganhanner.messageservicev2.domain.Message;
import io.zipcode.loganhanner.messageservicev2.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MessageService {

    @Autowired
    MessageRepository messageRepository;

    public Iterable<Message> getAllByUserId(long userId) {
        return messageRepository.getAllByUserId(userId);
    }

    public Message getMessage(long messageId) {
        Message message = messageRepository.getMessage(messageId);
        if(message == null) {
            return null;
        }
        return message;
    }

    public boolean addMessage(Message message) {
        boolean created = messageRepository.addMessage(message);

        if(!created) {
            return false;
        }
        return created;
    }

    public boolean updateMessage(long messageId, Message updatedMessage) {
        boolean updated = messageRepository.updateMessage(messageId, updatedMessage);

        if(!updated) {
            return false;
        }
        return updated;
    }

    public boolean deleteMessage(long messageId) {
        boolean deleted = messageRepository.deleteMessage(messageId);

        if(!deleted) {
            return false;
        }
        return deleted;
    }


}
