package com.project.fileserver.authentication;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{userEmail:'?0'}")
    User findUserByUserEmail(String userEmail);

    public long count();
}
