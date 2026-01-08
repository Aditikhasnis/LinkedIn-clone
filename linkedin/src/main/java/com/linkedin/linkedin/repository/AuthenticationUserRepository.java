//Created by Aditi Anand
package com.linkedin.linkedin.repository;

import com.linkedin.linkedin.model.AuthenticateUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthenticationUserRepository extends JpaRepository<AuthenticateUser,Long> {

     static Optional<AuthenticateUser> findByEmail(String email) {
        return null;
    }


}
