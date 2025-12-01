package com.rohit.SpingBootTaskManager.repository;

import com.rohit.SpingBootTaskManager.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
