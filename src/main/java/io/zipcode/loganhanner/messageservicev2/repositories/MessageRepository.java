package io.zipcode.loganhanner.messageservicev2.repositories;

import io.zipcode.loganhanner.messageservicev2.domain.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

    Iterable<Message> getAllByUserId(long userId);

    Iterable<Message> findMessageByMessageBodyContaining(String search);
//
//    Message getMessage(long messageId);
//
//    boolean addMessage(Message message);
//
//    boolean updateMessage(long messageId, Message message);
//
//    boolean deleteMessage(long messageId);

}
