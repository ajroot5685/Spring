package com.example.testOAuth2JWT.repository;

import com.example.testOAuth2JWT.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
