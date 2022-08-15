package org.team2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;


import javax.persistence.Cacheable;
import java.util.List;
import java.util.Map;


@RestController
public class APIController {

    @Autowired
    RestaurantRepo restaurantRepo;
    @Autowired
    UserRepo userRepo;


    @GetMapping("/restaurants")
    public List<Restaurant> findAllRestaurants(){
        List<Restaurant> restaurants = restaurantRepo.findAll();
        return restaurants;}


    @GetMapping("/user")
    public List<User> index(){return userRepo.findAll();}


    @GetMapping(value = "/user/login/{username}", produces = "application/json")
    public List<User> loginUser(@RequestParam(value ="username", defaultValue = "") String username){

        return userRepo.findByUsername(username);
    }






    @PostMapping("/addUser")
    public User addUser(@RequestBody User newUser){

        return userRepo.save(newUser);

    }

//    @PostMapping("user/search")
//    public List<User> search(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("username");
//        return userRepo.FindUsername(searchTerm);
//    }

//    @PostMapping("user/register")
//    public List<User> adduser(@RequestBody Map<String, String> body, Map <Integer, Integer> body2, Map<Boolean, Boolean> body3){
//        String username = body.get("username");
//        String password = body.get("password");
//        Integer id = body2.get("id");
//        Boolean authorized = body3.get("authorized");
//
//        return userRepo.addUser(username, password, id, authorized);
//    }




}
