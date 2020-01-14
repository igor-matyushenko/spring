package com.accenture.flowershopNew.be.entity;

import com.accenture.flowershopNew.fe.ENUM.Roles;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USERS")
public class User implements Serializable {
    Long id;
    String login;
    String password;
    Roles roles;

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.roles = Roles.USER;
    }
}
