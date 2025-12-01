package com.rohit.SpingBootTaskManager.service;

import com.rohit.SpingBootTaskManager.dto.LoginRequest;
import com.rohit.SpingBootTaskManager.dto.UserRequest;
import com.rohit.SpingBootTaskManager.entity.User;
import com.rohit.SpingBootTaskManager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public User register(UserRequest req) {
        User user = new User();
        user.setName(req.getName());
        user.setEmail(req.getEmail());
        user.setPassword(req.getPassword());
        return userRepo.save(user);
    }

    public String login(LoginRequest req) {
        User user = userRepo.findByEmail(req.getEmail());
        if (user == null)
            return "User not found";

        if (!user.getPassword().equals(req.getPassword()))
            return "Invalid credentials";

        return "Login Successful";
    }
}