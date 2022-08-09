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

   @GetMapping("/restaurant/{id}")
    public Restaurant show(@PathVariable String id){
       int restaurantId = Integer.parseInt(id);
       return restaurantRepo.findOne(restaurantId);
   }

   @PostMapping("/restaurant/search")
    public List<Restaurant> search(@RequestBody Map<String, String> body){
       String searchTerm = body.get("text");
       return restaurantRepo.FindRestaurant(searchTerm);
   }

   @PostMapping("/restaurant")
    public Restaurant create(@RequestBody Map<String, String> body){
       String Business_name = body.get("Business_name");
       String city =  body.get("city");
       return restaurantRepo.save(new Restaurant(Business_name, city));
   }

   @PutMapping("/restaurant/{id}")
    public Restaurant update(@PathVariable String id, @RequestBody Map<String, String> Body){
       int restaurantId = Integer.parseInt(id);

       Restaurant restaurant = restaurantRepo.findOne(restaurantId);
       restaurant.setCity(Body.get("city"));
       restaurant.setName(Body.get("name"));
       return restaurantRepo.save(restaurant);

   }


   @DeleteMapping("restaurant/{id}")
    public boolean delete(@PathVariable String id){
       int restaurantid = Integer.parseInt(id);
       restaurantRepo.delete(restaurantid);
   }


}
