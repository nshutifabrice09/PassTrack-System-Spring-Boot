package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Route;
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
        Route route = routeRepository.findRouteById(routeId);
        stop.setRoute(route);
        return stopRepository.save(stop);
    }

    @Override
    public Stop updateStop(Long id, Stop stop) {
        Stop existStop = stopRepository.findStopById(id);
        if(existStop != null){
            existStop.setStopName(stop.getStopName());
            existStop.setLocation(stop.getLocation());
            return stopRepository.save(existStop);
        }
        return null;
    }

    @Override
    public void removeStop(Long id) {
        stopRepository.deleteById(id);
    }
}
