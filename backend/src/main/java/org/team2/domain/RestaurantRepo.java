package org.team2.domain;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.team2.domain.Restaurant;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurant")

public interface RestaurantRepo extends CrudRepository<Restaurant, Long> {

    List<Restaurant> findByBusinessName(@Param("business_name") String businessName);
    List<Restaurant> findByCity(@Param("city") String city);
    List<Restaurant> findByAddress(@Param("address") String address);
    List<Restaurant> findByStars(@Param("stars") Integer stars);
    List<Restaurant> findByReviewCount(@Param("reviewCount") Integer reviewCount);
}
