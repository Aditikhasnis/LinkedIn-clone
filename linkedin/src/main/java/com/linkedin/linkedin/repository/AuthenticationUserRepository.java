package com.linkedin.linkedin.repository;

import com.linkedin.linkedin.model.AuthenticateUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthenticationUserRepository extends JpaRepository<AuthenticateUser,Long> { }
