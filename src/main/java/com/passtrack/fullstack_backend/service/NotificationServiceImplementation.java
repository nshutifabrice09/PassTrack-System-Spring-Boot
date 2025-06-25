package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.Notification;
import com.passtrack.fullstack_backend.model.Passenger;
import com.passtrack.fullstack_backend.repository.NotificationRepository;
import com.passtrack.fullstack_backend.repository.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImplementation implements NotificationService{

    private final NotificationRepository notificationRepository;
    private final PassengerRepository passengerRepository;

    @Autowired
    public NotificationServiceImplementation(NotificationRepository notificationRepository, PassengerRepository passengerRepository) {
        this.notificationRepository = notificationRepository;
        this.passengerRepository = passengerRepository;
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification getNotificationById(Long id) {
        return notificationRepository.findNotificationById(id);
    }

    @Override
    public Notification saveNotification(Notification notification, Long passengerId) {
        Passenger passenger = passengerRepository.findPassengerById(passengerId);
        notification.setPassenger(passenger);
        return notificationRepository.save(notification);
    }

    @Override
    public Notification updateNotification(Long id, Notification notification) {
        Notification existNotification = notificationRepository.findNotificationById(id);
        if(existNotification != null){
            existNotification.setMessage(notification.getMessage());
            existNotification.setSentAt(notification.getSentAt());
            existNotification.setChannel(notification.getChannel());
            return notificationRepository.save(existNotification);
        }
        return null;
    }

    @Override
    public void removeNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
