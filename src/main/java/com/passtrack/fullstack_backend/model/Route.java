package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Route {
    @Id
    @GeneratedValue
    private Long id;
    private String routeName;

    @OneToMany(mappedBy = "route")
    private List<Stop> stops;
}
