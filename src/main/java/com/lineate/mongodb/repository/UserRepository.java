package com.lineate.mongodb.repository;

import com.lineate.mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByFirstName(String firstName);

    List<User> findByLastName(String lastName);

    List<User> findByPosition(String position);
}
