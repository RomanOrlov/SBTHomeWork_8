package ru.sbt.orlov.domain;

import java.util.Date;
import java.util.List;

public class Chat {
    
    private Long chatId;
    private Date created; 
    private String chatName;
    private List<User> chatUsers;
    private List<Message> messages;

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getChatName() {
        return chatName;
    }

    public void setChatName(String chatName) {
        this.chatName = chatName;
    }

    public List<User> getChatUsers() {
        return chatUsers;
    }

    public void setChatUsers(List<User> chatUsers) {
        this.chatUsers = chatUsers;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
