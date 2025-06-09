package com.passtrack.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Bus {
    @Id
    @GeneratedValue
    private Long plateNumber;
    private String busId;
    private String routeId;
    private float price;

}
