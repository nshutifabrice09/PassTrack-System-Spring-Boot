package com.passtrack.fullstack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Route {
    @Id
    @GeneratedValue
    private Long routeId;
    private String startLocation;
    private String endLocation;
    private String schedule;

}
