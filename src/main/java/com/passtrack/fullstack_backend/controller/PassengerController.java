package com.passtrack.fullstack_backend.controller;

import com.passtrack.fullstack_backend.model.Passenger;
import com.passtrack.fullstack_backend.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class PassengerController {

    private final PassengerService passengerService;

    @Autowired
    public PassengerController(PassengerService passengerService) {
        this.passengerService = passengerService;
    }

    @PostMapping("/passenger")
    public Passenger savePassenger(@RequestBody Passenger passenger){
        return passengerService.savePassenger(passenger);
    }

    @GetMapping("/passengers")
    public List<Passenger> passengerList(){
        return passengerService.getAllPassengers();
    }

    @GetMapping("/passenger/{id}")
    public Passenger getPassenger(@PathVariable ("id") Long id){
        return passengerService.getPassengerById(id);
    }

}
