package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Bus;

import java.util.List;

public interface BusService {
    List<Bus> getAllBuses();
    Bus getBusById(Long id);
    Bus save(Bus bus, Long driverId, Long routeId);
    Bus update(Long id, Bus bus);
    void remove(Long id);

}
