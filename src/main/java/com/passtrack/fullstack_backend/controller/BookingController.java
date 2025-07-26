package com.passtrack.fullstack_backend.controller;


import com.passtrack.fullstack_backend.model.Booking;
import com.passtrack.fullstack_backend.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService){
        this.bookingService= bookingService;
    }

    @PostMapping("/booking/{passengerId}/{tripId}")
    public Booking saveBooking(@RequestBody Booking booking, @PathVariable ("PassengerId") Long passengerId, @PathVariable ("tripId") Long tripId){
        return bookingService.save(booking, passengerId, tripId);
    }
    

}
