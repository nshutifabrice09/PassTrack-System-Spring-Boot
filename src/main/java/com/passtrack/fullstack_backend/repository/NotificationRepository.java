package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Notification findNotificationById(Long id);
}
