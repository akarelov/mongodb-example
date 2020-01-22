package com.lineate.mongodb.repository;

import com.lineate.mongodb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByFirstName(String firstName);

    User findByLastName(String lastName);

    User findByPosition(String position);
}
