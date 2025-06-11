package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Bus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImplementation implements BusService{
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
