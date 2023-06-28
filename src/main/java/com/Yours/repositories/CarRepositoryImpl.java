package com.Yours.repositories;

import com.Yours.models.entities.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CarRepositoryImpl implements CarRepositoryCustom{

    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public Car create(Car request) {
       return mongoTemplate.insert(request, "car");
    }
}
