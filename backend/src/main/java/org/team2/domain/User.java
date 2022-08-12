package org.team2.domain;


import javax.persistence.*;
import java.io.Serializable;
import org.hibernate.annotations.NaturalId;
@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    @NaturalId
    private String username;
    private String password;
    private Boolean authorized;

    protected User() {
    }

    public User(String username, String password, Boolean authorized, Integer id) {
        this.username = username;
        this.password =password;
        this.authorized = authorized;
        this.id = id;
    }


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
                ", authroized='" + authorized + '\'' +
                '}';
    }
}

