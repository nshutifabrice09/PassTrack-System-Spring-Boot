package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Route;
import com.passtrack.fullstack_backend.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImplementation implements RouteService{

    private final RouteRepository routeRepository;

    @Autowired
    public RouteServiceImplementation(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    public List<Route> getAllRoutes() {
        return routeRepository.findAll();
    }

    @Override
    public Route getRouteById(Long id) {
        return routeRepository.findRouteById(id);
    }

    @Override
    public Route saveRoute(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public Route updateRoute(Long id, Route route) {
        Route existRoute = routeRepository.findRouteById(id);
        if(existRoute !=null){
            existRoute.setRouteName(route.getRouteName());
            return routeRepository.save(existRoute);
        }
        return null;
    }

    @Override
    public void removeRoute(Long id) {
        routeRepository.deleteById(id);
    }
}
