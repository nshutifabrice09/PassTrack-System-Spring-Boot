package com.passtrack.fullstack_backend.controller;

import com.passtrack.fullstack_backend.model.Stop;
import com.passtrack.fullstack_backend.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class StopController {

    private final StopService stopService;

    @Autowired
    public StopController(StopService stopService){
        this.stopService = stopService;
    }

    @PostMapping("/stop/{routeId}")
    public Stop save(@RequestBody Stop stop, @PathVariable ("routeId") Long routeId){
        return stopService.saveStop(stop, routeId);
    }

//    @GetMapping("/routes")
//    public List<Stop> stopList(){
//        return stopService.getAllStops();
//    }

}
