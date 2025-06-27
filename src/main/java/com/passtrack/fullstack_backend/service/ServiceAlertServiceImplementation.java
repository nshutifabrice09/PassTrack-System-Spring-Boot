package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.ServiceAlert;
import com.passtrack.fullstack_backend.repository.ServiceAlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAlertServiceImplementation implements ServiceAlertService{

    private final ServiceAlertRepository serviceAlertRepository;

    @Autowired
    public ServiceAlertServiceImplementation (ServiceAlertRepository serviceAlertRepository){
        this.serviceAlertRepository= serviceAlertRepository;
    }

    @Override
    public List<ServiceAlert> getAllServiceAlerts() {
        return null;
    }

    @Override
    public ServiceAlert getServiceAlertById(Long id) {
        return null;
    }

    @Override
    public ServiceAlert saveServiceAlert(ServiceAlert serviceAlert) {
        return null;
    }

    @Override
    public ServiceAlert updateServiceAlert(Long id, ServiceAlert serviceAlert) {
        return null;
    }

    @Override
    public void removeServiceAlert(Long id) {

    }
}
