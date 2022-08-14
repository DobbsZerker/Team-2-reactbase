package org.team2.domain;



import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "restaurants", path = "restaurants")

public interface UserRepo extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);

    List<User> findByUsername(@Param("username") String username);

//    List<User> User(String username, String password, Integer id, Boolean authorized);


}

