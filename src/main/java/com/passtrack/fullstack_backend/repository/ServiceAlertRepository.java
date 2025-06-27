package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.ServiceAlert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceAlertRepository extends JpaRepository <ServiceAlert, Long> {
    ServiceAlert findServiceAlertById(Long id);
}
