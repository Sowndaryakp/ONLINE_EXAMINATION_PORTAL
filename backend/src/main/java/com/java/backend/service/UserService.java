package com.java.backend.service;

import com.java.backend.model.User;

public interface UserService {
    User findByUsername(String username);
    User save(User user);
}
