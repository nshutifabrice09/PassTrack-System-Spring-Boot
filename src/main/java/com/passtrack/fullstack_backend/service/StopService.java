package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Stop;

import java.util.List;

public interface StopService {
    List<Stop> getAllStops();
    Stop getStopById(Long id);
    Stop saveStop(Stop stop, Long routeId);
    Stop updateStop(Long id, Stop stop);
    void removeStop(Long id);
}
