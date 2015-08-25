package com.tchepannou.auth.client.v1;

import org.hibernate.validator.constraints.NotBlank;

public class LoginRequest {
    //-- Attributes
    @NotBlank(message="username")
    private String username;

    @NotBlank(message="password")
    private String password;

    //-- Getter/Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
