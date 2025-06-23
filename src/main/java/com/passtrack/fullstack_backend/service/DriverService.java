package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Driver;

import java.util.List;

public interface DriverService {
    List<Driver> getAllDrivers();
    Driver getDriverById(Long id);
    Driver saveDriver(Driver driver, Long busId);
    Driver updateDriver(Long id, Driver driver);
    void removeDriver(Long id);
}
