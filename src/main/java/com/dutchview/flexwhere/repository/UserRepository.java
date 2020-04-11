package com.dutchview.flexwhere.repository;

import com.dutchview.flexwhere.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    public User findById(String id);

    public Long deleteById(String id);
}