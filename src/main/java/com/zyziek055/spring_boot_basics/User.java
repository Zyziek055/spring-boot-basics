package com.zyziek055.spring_boot_basics;

public class User {
    private Long id;
    public String email;
    private String password;
    private String name;

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
}
