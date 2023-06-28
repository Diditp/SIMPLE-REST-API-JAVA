package com.Yours.repositories;

import com.Yours.models.entities.Car;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CarRepository extends MongoRepository<Car, String> {
}
