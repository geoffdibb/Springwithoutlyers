package com.BAE.domain.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.BAE.domain.SentAccount;

@Repository
public interface MongoAccountRepo extends MongoRepository<SentAccount, Long>{
}