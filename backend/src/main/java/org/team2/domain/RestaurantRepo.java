package org.team2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.team2.domain.Restaurant;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "restaurant", path = "restaurant")

public interface RestaurantRepo extends JpaRepository<Restaurant, Long> {
    Restaurant findByBusinessId(Integer businessId);
}
