package org.team2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team2.domain.User;
import org.team2.domain.UserRepo;

import java.util.List;

@Service
public class UserService {
    @Autowired private UserRepo repo;

    public List <User> listAll(){
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }
}