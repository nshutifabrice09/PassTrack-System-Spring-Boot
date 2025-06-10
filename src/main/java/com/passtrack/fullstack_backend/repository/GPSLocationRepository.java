package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.GPSLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GPSLocationRepository extends JpaRepository <GPSLocation, Long> {
}
