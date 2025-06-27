package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.User;
import com.passtrack.fullstack_backend.repository.DriverRepository;
import com.passtrack.fullstack_backend.repository.PassengerRepository;
import com.passtrack.fullstack_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;
    private final PassengerRepository passengerRepository;
    private final DriverRepository driverRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository, PassengerRepository passengerRepository, DriverRepository driverRepository) {
        this.userRepository = userRepository;
        this.passengerRepository = passengerRepository;
        this.driverRepository = driverRepository;
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User saveUser(User user, Long passengerId, Long driverId) {
        return null;
    }

    @Override
    public User updateUser(Long id, User user) {
        return null;
    }

    @Override
    public void removeUser(Long id) {

    }
}
