package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Bus;
import com.passtrack.fullstack_backend.model.Trip;
import com.passtrack.fullstack_backend.repository.BusRepository;
import com.passtrack.fullstack_backend.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TripServiceImplementation implements TripService{

    private final TripRepository tripRepository;
    private final BusRepository busRepository;

    @Autowired
    public TripServiceImplementation(TripRepository tripRepository, BusRepository busRepository) {
        this.tripRepository = tripRepository;
        this.busRepository = busRepository;
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll();
    }

    @Override
    public Trip getTripById(Long id) {
        return tripRepository.findTripById(id);
    }

    @Override
    public Trip saveTrip(Trip trip, Long busId) {
        Bus bus = busRepository.findBusById(busId);
        trip.setBus(bus);
        return tripRepository.save(trip);
    }

    @Override
    public Trip updateTrip(Long id, Trip trip) {
        return null;
    }

    @Override
    public void removeTrip(Long id) {

    }
}
