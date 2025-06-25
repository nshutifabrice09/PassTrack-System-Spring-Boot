package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.GPSLocation;

import java.util.List;

public interface GPSLocationService {
    List<GPSLocation> getGpsLocations();
    GPSLocation getGpsLocationById(Long id);
    GPSLocation saveGpsLocation(GPSLocation gpsLocation, Long tripId);
    GPSLocation updateGpsLocation(Long id, GPSLocation gpsLocation);
    void removeGPSLocation(Long id);
}
