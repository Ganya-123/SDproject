package com.example.demo.repo;

import com.example.demo.entity.User;
import com.example.demo.entity.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userrepo extends MongoRepository<User,String>{
    
}
