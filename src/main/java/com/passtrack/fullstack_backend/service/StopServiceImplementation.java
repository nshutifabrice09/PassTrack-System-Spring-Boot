package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Stop;
import com.passtrack.fullstack_backend.repository.RouteRepository;
import com.passtrack.fullstack_backend.repository.StopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StopServiceImplementation implements StopService{

    private final StopRepository stopRepository;
    private final RouteRepository routeRepository;

    @Autowired
    public StopServiceImplementation(StopRepository stopRepository, RouteRepository routeRepository) {
        this.stopRepository = stopRepository;
        this.routeRepository = routeRepository;
    }


    @Override
    public List<Stop> getAllStops() {
        return stopRepository.findAll();
    }

    @Override
    public Stop getStopById(Long id) {
        return stopRepository.findStopById(id);
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
