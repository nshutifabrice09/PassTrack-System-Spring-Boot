package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements BookingService{
    @Override
    public List<Booking> getAllBookings() {
        return null;
    }

    @Override
    public Booking getBookingById(Long id) {
        return null;
    }

    @Override
    public Booking save(Booking booking, Long passengerId, Long tripId) {
        return null;
    }

    @Override
    public Booking update(Booking booking, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
