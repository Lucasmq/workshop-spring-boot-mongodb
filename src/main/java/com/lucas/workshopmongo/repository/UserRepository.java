package com.lucas.workshopmongo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.lucas.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
