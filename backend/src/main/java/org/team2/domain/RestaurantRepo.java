package org.team2.domain;

import org.springframework.data.repository.CrudRepository;

import org.team2.domain.Restaurant;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RestaurantRepo extends CrudRepository<Restaurant, Integer> {
    Restaurant findByBusinessId(Integer businessId);
}
