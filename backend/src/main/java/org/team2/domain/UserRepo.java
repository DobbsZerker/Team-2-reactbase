package org.team2.domain;



import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);

//    List<User> User(String username, String password, Integer id, Boolean authorized);


}

