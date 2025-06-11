package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Booking;
import com.passtrack.fullstack_backend.model.Passenger;
import com.passtrack.fullstack_backend.model.Trip;
import com.passtrack.fullstack_backend.repository.BookingRepository;
import com.passtrack.fullstack_backend.repository.PassengerRepository;
import com.passtrack.fullstack_backend.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImplementation implements BookingService{
    private final BookingRepository bookingRepository;
    private final PassengerRepository passengerRepository;
    private final TripRepository tripRepository;

    @Autowired
    public BookingServiceImplementation(BookingRepository bookingRepository, PassengerRepository passengerRepository, TripRepository tripRepository) {
        this.bookingRepository = bookingRepository;
        this.passengerRepository = passengerRepository;
        this.tripRepository = tripRepository;
    }


    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long id) {
        return bookingRepository.findBookingById(id);
    }

    @Override
    public Booking save(Booking booking, Long passengerId, Long tripId) {
        Passenger passenger = passengerRepository.findPassengerById(passengerId);
        Trip trip = tripRepository.findTripById(tripId);
        booking.setPassenger(passenger);
        booking.setTrip(trip);
        return bookingRepository.save(booking);
    }

    @Override
    public Booking update(Booking booking, Long id) {
        Booking existBooking = bookingRepository.findBookingById(id);
        if(existBooking != null){
            existBooking.setSeatNumber(booking.getSeatNumber());
            existBooking.setBookingTime(booking.getBookingTime());
            existBooking.setStatus(booking.getStatus());
            existBooking.setPaymentStatus(booking.getPaymentStatus());
            return bookingRepository.save(existBooking);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        bookingRepository.deleteById(id);
    }
}
