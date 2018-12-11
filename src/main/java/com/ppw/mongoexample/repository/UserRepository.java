package com.ppw.mongoexample.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ppw.mongoexample.model.User;

public interface UserRepository extends MongoRepository<User, String>{

   public Page<User> findByUserNameLike(String userName, Pageable pageable);
}
