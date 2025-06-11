package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository <Driver, Long> {
    Driver findDriverById(Long driverId);
}
