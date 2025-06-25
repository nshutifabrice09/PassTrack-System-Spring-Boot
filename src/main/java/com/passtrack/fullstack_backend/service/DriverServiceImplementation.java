package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Bus;
import com.passtrack.fullstack_backend.model.Driver;
import com.passtrack.fullstack_backend.repository.BusRepository;
import com.passtrack.fullstack_backend.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverServiceImplementation implements DriverService{
    private final DriverRepository driverRepository;
    private final BusRepository busRepository;

    @Autowired
    public DriverServiceImplementation(DriverRepository driverRepository, BusRepository busRepository) {
        this.driverRepository = driverRepository;
        this.busRepository = busRepository;
    }
    @Override
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }

    @Override
    public Driver getDriverById(Long id) {
        return driverRepository.findDriverById(id);
    }

    @Override
    public Driver saveDriver(Driver driver, Long busId) {
        Bus bus = busRepository.findBusById(busId);
        driver.setBus(bus);
        return driverRepository.save(driver);
    }

    @Override
    public Driver updateDriver(Long id, Driver driver) {
        Driver existDriver = driverRepository.findDriverById(id);
        if(existDriver != null){
            existDriver.setFullName(driver.getFullName());
            existDriver.setPhoneNumber(driver.getPhoneNumber());
            existDriver.setLicenseNumber(driver.getLicenseNumber());
            return driverRepository.save(existDriver);
        }
        return null;
    }

    @Override
    public void removeDriver(Long id) {
        driverRepository.deleteById(id);
    }
}
