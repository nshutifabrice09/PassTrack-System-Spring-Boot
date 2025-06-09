package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Bus bus;

    private LocalDateTime startTime;
    private LocalDateTime estimatedArrivalTime;

    @OneToMany(mappedBy = "trip")
    private List<GPSLocation> gpsLocations;

    private int currentOccupancy;
}
