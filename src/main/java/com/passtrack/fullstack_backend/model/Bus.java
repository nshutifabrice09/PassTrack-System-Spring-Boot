package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String busNumber;
    private String licensePlate;
    private int capacity;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Route route;
}

