package org.team2.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.team2.domain.User;
import org.team2.domain.UserRepo;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public List<User> listAll() {
        return (List<User>) repo.findAll();
    }

    public void save(User user) {
        repo.save(user);
    }

//    public User get(Integer id) throws UserNotFoundException{
//       Optional<User> result = repo.findById(Long.valueOf(id));
//       if (result.isPresent()){
//           return result.get();
//       }
//       throw new UserNotFoundException("no id found");
//
//    }
}