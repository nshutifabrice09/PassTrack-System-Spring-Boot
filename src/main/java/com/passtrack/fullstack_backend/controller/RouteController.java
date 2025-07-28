package com.passtrack.fullstack_backend.controller;

import com.passtrack.fullstack_backend.model.Route;
import com.passtrack.fullstack_backend.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class RouteController {

    private final RouteService routeService;

    @Autowired
    public RouteController(RouteService routeService) {
        this.routeService = routeService;
    }

    @PostMapping("/route")
    public Route save(@RequestBody Route route){
        return routeService.saveRoute(route);
    }

    @GetMapping("/routes")
    public List<Route> routeList(){
        return routeService.getAllRoutes();
    }

}
