package com.java.backend.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public boolean authenticate(String username, String password) {
        // Implement your authentication logic here (e.g., check against a database)
        // Return true if authentication is successful, false otherwise
        return username.equals("admin") && password.equals("password");
    }
}
