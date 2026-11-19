package com.roadseva.service;

import java.util.List;
import com.roadseva.entity.User;

public interface UserService {

    User createUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);
}