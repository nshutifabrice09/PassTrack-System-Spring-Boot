package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking getBookingById(Long id);
    Booking save(Booking booking, Long passengerId, Long tripId);
    Booking update(Booking booking, Long id);
    void delete(Long id);
}
