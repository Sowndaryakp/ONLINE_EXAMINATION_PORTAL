package com.java.backend.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordHashingExample {

    public static void main(String[] args) {
        // Create an instance of PasswordEncoder
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        // Original password
        String originalPassword = "myPassword123";

        // Hash the password
        String hashedPassword = passwordEncoder.encode(originalPassword);

        // Print the hashed password
        System.out.println("Original Password: " + originalPassword);
        System.out.println("Hashed Password: " + hashedPassword);

        // Check if the entered password matches the hashed password
        boolean isMatch = passwordEncoder.matches(originalPassword, hashedPassword);
        System.out.println("Password Match: " + isMatch);
    }
}
