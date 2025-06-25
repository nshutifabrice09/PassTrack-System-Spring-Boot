package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Route;

import java.util.List;

public interface RouteService {
    List<Route> getAllRoutes();
    Route getRouteById(Long id);
    Route saveRoute(Route route);
    Route updateRoute(Long id, Route route);
    void removeRoute(Long id);
}
