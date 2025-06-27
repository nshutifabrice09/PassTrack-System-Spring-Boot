package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.ServiceAlert;

import java.util.List;

public interface ServiceAlertService {

    List<ServiceAlert> getAllServiceAlerts();
    ServiceAlert getServiceAlertById(Long id);
    ServiceAlert saveServiceAlert(ServiceAlert serviceAlert);
    ServiceAlert updateServiceAlert(Long id, ServiceAlert serviceAlert);
    void removeServiceAlert(Long id);
}
