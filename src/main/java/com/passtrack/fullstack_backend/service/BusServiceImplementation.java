package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Bus;
import com.passtrack.fullstack_backend.repository.BusRepository;
import com.passtrack.fullstack_backend.repository.DriverRepository;
import com.passtrack.fullstack_backend.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImplementation implements BusService{

    private final BusRepository busRepository;
    private final DriverRepository driverRepository;
    private final RouteRepository routeRepository;

    @Autowired
    public BusServiceImplementation(BusRepository busRepository, DriverRepository driverRepository, RouteRepository routeRepository) {
        this.busRepository = busRepository;
        this.driverRepository = driverRepository;
        this.routeRepository = routeRepository;
    }

    @Override
    public List<Bus> getAllBuses() {
        return null;
    }

    @Override
    public Bus getBusById(Long id) {
        return null;
    }

    @Override
    public Bus save(Bus bus, Long driverId, Long routeId) {
        return null;
    }

    @Override
    public Bus update(Long id, Bus bus) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }
}
