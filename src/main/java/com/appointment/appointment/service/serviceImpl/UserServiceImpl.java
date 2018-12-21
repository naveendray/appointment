package com.appointment.appointment.service.serviceImpl;

import com.appointment.appointment.model.User;
import com.appointment.appointment.repository.UserRepository;
import com.appointment.appointment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
