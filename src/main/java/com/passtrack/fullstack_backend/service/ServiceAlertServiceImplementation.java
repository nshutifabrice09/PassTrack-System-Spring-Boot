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
        return serviceAlertRepository.findAll();
    }

    @Override
    public ServiceAlert getServiceAlertById(Long id) {
        return serviceAlertRepository.findServiceAlertById(id);
    }

    @Override
    public ServiceAlert saveServiceAlert(ServiceAlert serviceAlert) {
        return serviceAlertRepository.save(serviceAlert);
    }

    @Override
    public ServiceAlert updateServiceAlert(Long id, ServiceAlert serviceAlert) {
        ServiceAlert existServiceAlert = serviceAlertRepository.findServiceAlertById(id);
        if(existServiceAlert != null){
            existServiceAlert.setAlertMessage(serviceAlert.getAlertMessage());
            existServiceAlert.setSeverity(serviceAlert.getSeverity());
            existServiceAlert.setCreatedAt(serviceAlert.getCreatedAt());
            existServiceAlert.setActive(serviceAlert.isActive());
            return serviceAlertRepository.save(existServiceAlert);
        }
        return null;
    }

    @Override
    public void removeServiceAlert(Long id) {
        serviceAlertRepository.deleteById(id);
    }
}
