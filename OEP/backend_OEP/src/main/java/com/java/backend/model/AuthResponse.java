package com.java.backend.model;

public class AuthResponse {
    private String message;
    private String token;
    private boolean registrationStatus;

    public AuthResponse() {
    }
    public AuthResponse(String message, String token, boolean registrationStatus) {
        this.message = message;
        this.token = token;
        this.registrationStatus = registrationStatus;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isRegistrationStatus() {
        return registrationStatus;
    }

    public void setRegistrationStatus(boolean registrationStatus) {
        this.registrationStatus = registrationStatus;
    }
}
