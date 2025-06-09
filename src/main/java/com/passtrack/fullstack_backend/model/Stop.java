package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

@Entity
public class Stop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stopName;
    private String location;

    @ManyToOne
    private Route route;
}

