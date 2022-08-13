package org.team2.domain;



import org.springframework.data.repository.CrudRepository;
import org.team2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends CrudRepository<User, Long> {

    User findByUsername(String username);
}

