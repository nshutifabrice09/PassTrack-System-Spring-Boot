package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Booking;
import com.passtrack.fullstack_backend.repository.BookingRepository;
import com.passtrack.fullstack_backend.repository.PassengerRepository;
import com.passtrack.fullstack_backend.repository.TripRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements BookingService{
    private final BookingRepository bookingRepository;
    private final PassengerRepository passengerRepository;
    private final TripRepository tripRepository;

    public BookingServiceImplementation(BookingRepository bookingRepository, PassengerRepository passengerRepository, TripRepository tripRepository) {
        this.bookingRepository = bookingRepository;
        this.passengerRepository = passengerRepository;
        this.tripRepository = tripRepository;
    }


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
