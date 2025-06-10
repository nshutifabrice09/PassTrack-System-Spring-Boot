package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
