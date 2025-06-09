package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String licenseNumber;

    @OneToOne(mappedBy = "driver")
    private Bus bus;
}

