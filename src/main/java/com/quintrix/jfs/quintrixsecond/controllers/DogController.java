package com.quintrix.jfs.quintrixsecond.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.quintrix.jfs.quintrixsecond.models.Dog;
import com.quintrix.jfs.quintrixsecond.services.DogService;

@RestController
public class DogController {

  @Autowired
  DogService dogService;

  @RequestMapping(method = RequestMethod.GET, value = "/dogs")
  List<Dog> getDogs() {
    return dogService.getDogs();
  }

  @RequestMapping(method = RequestMethod.POST, value = "/dogs")
  Dog addDog(@RequestBody Dog dog) {
    return dogService.addDog(dog);
  }

}
