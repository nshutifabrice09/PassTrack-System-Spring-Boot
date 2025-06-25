package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Passenger;

import java.util.List;

public interface PassengerService {
    List<Passenger> getAllPassengers();
    Passenger getPassengerById(Long id);
    Passenger savePassenger(Passenger passenger);
    Passenger updatePassenger(Long id, Passenger passenger);
    void removePassenger (Long id);
}
