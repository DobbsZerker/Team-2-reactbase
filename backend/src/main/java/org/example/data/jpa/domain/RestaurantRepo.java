package org.example.data.jpa.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurant")
public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {


    public List<Restaurant> FindRestaurant(@Param("restaurant")String restaurant);

    public List<Restaurant> FindCity(@Param("city")String city);


}
