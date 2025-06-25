package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Passenger;
import com.passtrack.fullstack_backend.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerServiceImplementation implements PassengerService{

    private PassengerRepository passengerRepository;

    @Autowired
    public PassengerServiceImplementation (PassengerRepository passengerRepository){
        this.passengerRepository= passengerRepository;
    }

    @Override
    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    @Override
    public Passenger getPassengerById(Long id) {
        return passengerRepository.findPassengerById(id);
    }

    @Override
    public Passenger savePassenger(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger updatePassenger(Long id, Passenger passenger) {
        Passenger existPassenger = passengerRepository.findPassengerById(id);
        if(existPassenger !=null){
            existPassenger.setFullName(passenger.getFullName());
            existPassenger.setPhoneNumber(passenger.getPhoneNumber());
            existPassenger.setEmail(passenger.getEmail());
            existPassenger.setLanguagePreference(passenger.getLanguagePreference());
            existPassenger.setAccessibilitySupport(passenger.isAccessibilitySupport());
            return passengerRepository.save(existPassenger);
        }
        return null;
    }

    @Override
    public void removePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}
