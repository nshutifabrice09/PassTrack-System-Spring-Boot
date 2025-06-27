package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user, Long passengerId, Long driverId);
    User updateUser(Long id, User user);
    void removeUser(Long id);
}
