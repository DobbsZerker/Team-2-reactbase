package org.team2.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepo extends JpaRepository<User, Long> {
    public List<User> FindUsername(@Param("username")String username);

    public List<User> FindPassword(@Param("password")String password);

    public List<User> FindAuthorized(@Param("isAuthorized")String isAuthorized);

}
