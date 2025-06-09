package com.passtrack.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Booking {

    @Id
    @GeneratedValue

    private Long bookingId;
    private String busId;
    private String userId;

}
