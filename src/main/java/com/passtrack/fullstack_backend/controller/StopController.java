package com.passtrack.fullstack_backend.controller;

import com.passtrack.fullstack_backend.service.StopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class StopController {

    private final StopService service;

    @Autowired
    public StopController(StopService service) {
        this.service = service;
    }

    
}
