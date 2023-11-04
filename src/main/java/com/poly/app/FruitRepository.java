package com.poly.app;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface FruitRepository extends MongoRepository<FruitModel ,String> {
}
