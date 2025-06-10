package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "buses")
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

