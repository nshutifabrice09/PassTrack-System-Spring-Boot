package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Notification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{
    @Override
    public List<Notification> getNotifications() {
        return null;
    }

    @Override
    public Notification getNotificationById(Long id) {
        return null;
    }

    @Override
    public Notification saveNotification(Notification notification, Long passengerId) {
        return null;
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        return null;
    }

    @Override
    public void removeNotification(Long id) {

    }
}
