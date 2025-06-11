package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerRepository extends JpaRepository <Passenger, Long> {
    Passenger findPassengerById(Long passengerId);
}
