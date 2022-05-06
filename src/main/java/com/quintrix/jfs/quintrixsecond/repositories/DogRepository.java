package com.quintrix.jfs.quintrixsecond.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.quintrix.jfs.quintrixsecond.models.Dog;

public interface DogRepository extends MongoRepository<Dog, String> {

}
