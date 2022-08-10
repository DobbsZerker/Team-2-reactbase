package org.team2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import java.util.List;

@CrossOrigin
    @RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurant")
    public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {


        List<Restaurant> FindRestaurant(@Param("restaurant")String restaurant);
        List<Restaurant> findByAddress(@Param("address") String address);
        List<Restaurant> FindCity(@Param("city")String city);
        List<Restaurant> findByStars(@Param("stars") String stars);
        List<Restaurant> findByReviewCount(@Param("review_count") String review_count);
        List<Restaurant> findByCategories(@Param("categories") String categories);


}
