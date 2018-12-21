package com.appointment.appointment.repository;

import com.appointment.appointment.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
