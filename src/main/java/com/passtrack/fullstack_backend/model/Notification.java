package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "notifications")
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

