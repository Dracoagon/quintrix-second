package com.quintrix.jfs.quintrixsecond.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.quintrix.jfs.quintrixsecond.models.Dog;
import com.quintrix.jfs.quintrixsecond.repositories.DogRepository;

@Service
public class DogService {

  @Autowired
  private DogRepository dogRepo;

  public List<Dog> getDogs() {
    List<Dog> dogs = dogRepo.findAll(Sort.by(Sort.Direction.ASC, "name"));
    return dogs;
  }

  public Dog addDog(Dog dog) {
    dogRepo.insert(dog);
    return dog;
  }

}
