package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getNotifications();
    Notification getNotificationById(Long id);
    Notification saveNotification(Notification notification, Long passengerId);
    Notification updateNotification(Long id, Notification notification);
    void removeNotification(Long id);
}
