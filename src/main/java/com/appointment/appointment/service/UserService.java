package com.appointment.appointment.service;

import com.appointment.appointment.model.User;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    Iterable<User> getAllUsers();
}
