package com.rest.api.cvData;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends MongoRepository<Hobby, String> {
}
