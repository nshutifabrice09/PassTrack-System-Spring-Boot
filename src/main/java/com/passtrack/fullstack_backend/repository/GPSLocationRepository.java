package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.GPSLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GPSLocationRepository extends JpaRepository <GPSLocation, Long> {
    GPSLocation findGPSLocationById(Long id);
}
