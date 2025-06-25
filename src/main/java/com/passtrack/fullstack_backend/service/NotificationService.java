package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getAllNotifications();
    Notification getNotificationById(Long id);
    Notification saveNotification(Notification notification, Long passengerId);
    Notification updateNotification(Long id, Notification notification);
    void removeNotification(Long id);
}
