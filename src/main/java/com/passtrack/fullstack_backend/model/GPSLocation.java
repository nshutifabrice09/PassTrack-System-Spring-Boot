package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class GPSLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Trip trip;

    private double latitude;
    private double longitude;
    private LocalDateTime timestamp;
}

