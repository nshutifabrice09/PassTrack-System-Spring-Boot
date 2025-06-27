package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user, Long driverId, Long passengerId);
    User updateUser(Long id, User user);
    void removeUser(Long id);
}
