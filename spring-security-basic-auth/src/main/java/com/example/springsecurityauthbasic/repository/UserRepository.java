package com.example.springsecurityauthbasic.repository;

import com.example.springsecurityauthbasic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
