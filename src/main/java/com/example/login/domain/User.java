package com.example.login.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class User {

    @Id
    
    private String username;
    private String password;

    // Constructors
    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters & Setters
    
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


