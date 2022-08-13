package org.team2.domain;


import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.NaturalId;
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 255, nullable = false, name="username")
    private String username;
    @Column(length = 255, nullable = false, name="password")
    private String password;
    @Column(length = 255, nullable = false, name="authorized")
    private Boolean authorized;



//    public User(String username, String password, Boolean authorized, Integer id) {
//        this.username = username;
//        this.password =password;
//        this.authorized = authorized;
//        this.id = id;
//    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorized='" + authorized + '\'' +
                '}';
    }
}