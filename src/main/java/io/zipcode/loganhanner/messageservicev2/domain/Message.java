package io.zipcode.loganhanner.messageservicev2.domain;

public class Message {

    long messageId;
    long userId;
    long threadId;
    String timestamp;
    String messageBody;

    public Message() {}

    public Message(long messageId, long userId, long threadId, String timestamp, String messageBody) {
        this.messageId = messageId;
        this.userId = userId;
        this.threadId = threadId;
        this.timestamp = timestamp;
        this.messageBody = messageBody;
    }

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getThreadId() {
        return threadId;
    }

    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }
}
