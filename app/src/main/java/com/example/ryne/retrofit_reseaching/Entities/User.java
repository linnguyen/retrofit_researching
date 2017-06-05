package com.example.ryne.retrofit_reseaching.Entities;

/**
 * Created by ryne on 05/06/2017.
 */

public class User {
    private String email;
    private String password;
    private String firebase_token;
    private int current_device;

    public User(String email, String password, String firebase_token) {
        this.email = email;
        this.password = password;
        this.firebase_token = firebase_token;
        this.current_device = 1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirebase_token() {
        return firebase_token;
    }

    public void setFirebase_token(String firebase_token) {
        this.firebase_token = firebase_token;
    }

    public int getCurrent_device() {
        return current_device;
    }

    public void setCurrent_device(int current_device) {
        this.current_device = current_device;
    }
}
