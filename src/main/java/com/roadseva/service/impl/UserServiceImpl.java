package com.roadseva.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.roadseva.entity.User;
import com.roadseva.repository.UserRepository;
import com.roadseva.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() ->
                    new RuntimeException("User not found: " + userId));
    }
}