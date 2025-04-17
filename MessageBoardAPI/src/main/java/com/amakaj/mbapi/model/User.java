package com.amakaj.mbapi.model;

import com.amakaj.mbapi.model.Message;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;

    private String username;
    private String password;

    // Create a one-to-many relationship with the Message entity
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Message> messages;
}