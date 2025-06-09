package com.passtrack.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User{
    @Id
    @GeneratedValue

    private Long userId;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;

}
