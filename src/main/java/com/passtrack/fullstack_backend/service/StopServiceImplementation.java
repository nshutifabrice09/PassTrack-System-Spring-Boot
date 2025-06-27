package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Stop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopServiceImplementation implements StopService{
    @Override
    public List<Stop> getAllStops() {
        return null;
    }

    @Override
    public Stop getStopById(Long id) {
        return null;
    }

    @Override
    public Stop saveStop(Stop stop, Long routeId) {
        return null;
    }

    @Override
    public Stop updateStop(Long id, Stop stop) {
        return null;
    }

    @Override
    public void removeStop(Long id) {

    }
}
