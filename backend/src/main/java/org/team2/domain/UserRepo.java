package org.team2.domain;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepo extends CrudRepository<User, Long> {
    List<User> findByUsername(@Param("username") String username);

}




