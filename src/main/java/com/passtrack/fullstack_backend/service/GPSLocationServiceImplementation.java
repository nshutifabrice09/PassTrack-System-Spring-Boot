package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.GPSLocation;
import com.passtrack.fullstack_backend.model.Trip;
import com.passtrack.fullstack_backend.repository.GPSLocationRepository;
import com.passtrack.fullstack_backend.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GPSLocationServiceImplementation implements GPSLocationService{

    private final GPSLocationRepository gpsLocationRepository;
    private final TripRepository tripRepository;

    @Autowired
    public GPSLocationServiceImplementation(GPSLocationRepository gpsLocationRepository, TripRepository tripRepository) {
        this.gpsLocationRepository = gpsLocationRepository;
        this.tripRepository = tripRepository;
    }

    @Override
    public List<GPSLocation> getAllGpsLocations() {
        return gpsLocationRepository.findAll();
    }

    @Override
    public GPSLocation getGpsLocationById(Long id) {
        return gpsLocationRepository.findGPSLocationById(id);
    }

    @Override
    public GPSLocation saveGpsLocation(GPSLocation gpsLocation, Long tripId) {
        Trip trip = tripRepository.findTripById(tripId);
        gpsLocation.setTrip(trip);
        return gpsLocationRepository.save(gpsLocation);
    }

    @Override
    public GPSLocation updateGpsLocation(Long id, GPSLocation gpsLocation) {
        GPSLocation existGpsLocation = gpsLocationRepository.findGPSLocationById(id);
        if(existGpsLocation != null){
            existGpsLocation.setLatitude(gpsLocation.getLatitude());
            existGpsLocation.setLongitude(gpsLocation.getLongitude());
            existGpsLocation.setTimestamp(gpsLocation.getTimestamp());
            return gpsLocationRepository.save(existGpsLocation);

        }
        return null;
    }

    @Override
    public void removeGPSLocation(Long id) {
        gpsLocationRepository.deleteById(id);
    }
}
