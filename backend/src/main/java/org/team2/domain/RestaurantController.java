package org.team2.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class RestaurantController {

   @Autowired
    RestaurantRepo restaurantRepo;

   @GetMapping("/restaurant")
    public List<Restaurant> index(){
       return restaurantRepo.findAll();
   }

//   @GetMapping("/restaurant/{id}")
//    public Restaurant show(@PathVariable String id){
//       int restaurantId = Integer.parseInt(id);
//       return restaurantRepo.findOne(restaurantId);
//   }

   @PostMapping("/restaurant/search")
    public List<Restaurant> search(@RequestBody Map<String, String> body){
       String searchTerm = body.get("text");
       return restaurantRepo.findRestaurantByBusinessName(searchTerm);
   }



}
