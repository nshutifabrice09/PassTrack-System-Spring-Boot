package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id @GeneratedValue
    private Long id;

    private String username;
    private String password;
    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

    private boolean enabled = true;

    @OneToOne
    private Passenger passenger; // For passenger-specific info

    @OneToOne
    private Driver driver; // For driver-specific info
}

