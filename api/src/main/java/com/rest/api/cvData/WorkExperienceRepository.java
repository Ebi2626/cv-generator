package com.rest.api.cvData;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkExperienceRepository extends MongoRepository<WorkExperience, UUID> {
}
