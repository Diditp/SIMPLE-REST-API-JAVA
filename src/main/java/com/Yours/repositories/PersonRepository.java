package com.Yours.repositories;

import com.Yours.models.entities.PersonID;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<PersonID, String> {
}
