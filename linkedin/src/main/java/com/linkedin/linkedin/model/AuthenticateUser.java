//Created by Aditi 2025
package com.linkedin.linkedin.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity(name = "users")
public class AuthenticateUser {

    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    @Setter
    private String pwd;

    public AuthenticateUser(String pwd, String email, Long id) {
        this.pwd = pwd;
        this.email = email;
        this.id = id;
    }
    public AuthenticateUser(){};

}
