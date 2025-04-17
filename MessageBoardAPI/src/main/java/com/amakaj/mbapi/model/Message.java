package com.amakaj.mbapi.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private int messageId;
    private String content;
    private LocalDateTime dateTimeStamp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id", nullable = false)
    private User user;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getMessageId() {
        return messageId;
    }

    public LocalDateTime getDateTimeStamp() {
        return dateTimeStamp;
    }

    public void setDateTimeStamp(LocalDateTime dateTimeStamp) {
        this.dateTimeStamp = dateTimeStamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}