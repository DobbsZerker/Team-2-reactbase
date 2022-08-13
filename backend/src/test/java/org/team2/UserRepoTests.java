package org.team2;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.team2.domain.User;
import org.team2.domain.UserRepo;
import org.junit.jupiter.api.Test;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepoTests {
    @Autowired private UserRepo repo;

    @Test
    public void testAddNew(){
        User user = new User();
        user.setPassword("password");
        user.setUsername("joeDoe");
        user.setAuthorized(true);
        user.setId(5);

        User savedUser = repo.save(user);

        Assertions.assertNotNull(savedUser);
        Assertions.assertTrue(savedUser.getId() > 0);
    }
    }

