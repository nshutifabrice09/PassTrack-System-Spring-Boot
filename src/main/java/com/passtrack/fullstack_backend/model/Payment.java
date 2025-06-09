package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Payment {

    @Id
    @GeneratedValue
    private Long paymentId;
    private float amount;
    private LocalDate paymentDate;
    private Long booking_BusId;
    private Long booking_UserId;

}
