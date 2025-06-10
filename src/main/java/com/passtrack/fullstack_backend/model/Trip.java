package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "trips")
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
