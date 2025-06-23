package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Bus;
import com.passtrack.fullstack_backend.model.Driver;
import com.passtrack.fullstack_backend.model.Route;
import com.passtrack.fullstack_backend.repository.BusRepository;
import com.passtrack.fullstack_backend.repository.DriverRepository;
import com.passtrack.fullstack_backend.repository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImplementation implements BusService {

    private final BusRepository busRepository;
    private final DriverRepository driverRepository;
    private final RouteRepository routeRepository;

    @Autowired
    public BusServiceImplementation(BusRepository busRepository, DriverRepository driverRepository, RouteRepository routeRepository) {
        this.busRepository = busRepository;
        this.driverRepository = driverRepository;
        this.routeRepository = routeRepository;
    }

    @Override
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    @Override
    public Bus getBusById(Long id) {
        return busRepository.findBusById(id);
    }

    @Override
    public Bus save(Bus bus, Long driverId, Long routeId) {
        Driver driver = driverRepository.findDriverById(driverId);
        Route route = routeRepository.findRouteById(routeId);
        bus.setConductor(driver);
        bus.setRoute(route);
        return busRepository.save(bus);
    }

    @Override
    public Bus update(Long id, Bus bus) {
        Bus existBus = busRepository.findBusById(id);
        if (existBus != null) {
            existBus.setBusNumber(bus.getBusNumber());
            existBus.setLicensePlate(bus.getLicensePlate());
            existBus.setCapacity(bus.getCapacity());
            return busRepository.save(existBus);
        }
        return null;
    }

    @Override
    public void remove(Long id) {
        busRepository.deleteById(id);
    }
}