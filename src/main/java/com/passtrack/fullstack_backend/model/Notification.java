package com.passtrack.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Passenger passenger;

    private String message;
    private LocalDateTime sentAt;

    private String channel; // SMS, Email, InApp
}

