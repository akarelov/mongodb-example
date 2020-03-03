package com.lineate.mongodb.repository;

import com.lineate.mongodb.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import java.util.List;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    List<User> findByFirstName(String firstName);

    List<User> findByLastName(String lastName);

    List<User> findByPosition(String position);
}
