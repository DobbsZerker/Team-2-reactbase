package org.team2.domain;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


import javax.persistence.Cacheable;
import java.util.List;
import java.util.Map;

@RestController
public class userController {


    @Autowired
    UserRepo userRepo;

    @CrossOrigin
    @PostMapping("/user/add")
    public User addUser(@RequestBody User newUser){

        return userRepo.save(newUser);

    }
}
