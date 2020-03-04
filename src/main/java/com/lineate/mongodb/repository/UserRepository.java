package com.lineate.mongodb.repository;

import com.lineate.mongodb.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveMongoRepository<User, String> {
    Flux<User> findByFirstName(String firstName);

    Flux<User> findByLastName(String lastName);

    Flux<User> findByPosition(String position);
}
