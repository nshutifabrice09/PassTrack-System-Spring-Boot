package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Trip;

import java.util.List;

public interface TripService {
    List<Trip> getAllTrips();
    Trip getTripById(Long id);
    Trip saveTrip(Trip trip, Long busId);
    Trip updateTrip(Long id, Trip trip);
    void removeTrip(Long id);
}
