package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Passenger passenger;

    @ManyToOne
    private Trip trip;

    private int seatNumber; // Optional if seats are numbered
    private LocalDateTime bookingTime;

    @Enumerated(EnumType.STRING)
    private BookingStatus status; // CONFIRMED, CANCELLED, PENDING

    private String paymentStatus; // PAID, UNPAID, FAILED
}

