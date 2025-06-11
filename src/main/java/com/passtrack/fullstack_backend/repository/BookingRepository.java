package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findBookingById(Long id);
}
