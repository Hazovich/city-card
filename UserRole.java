package com.citycard.clients;

public enum UserRole {
    CLIENT ("User"), PRIVILEGE ("VIP"), ADMIN("ADM");

    String role;

    UserRole (String role){
        this.role = role;
    }
}
