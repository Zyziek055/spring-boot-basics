package com.zyziek055.spring_boot_basics;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class InMemoryUserRepository implements UserRepository{
    private HashMap<String, User> users = new HashMap<>();

    public void save(User user) {
        System.out.println("Saving user: " + user);
        users.put(user.getEmail(), user);
    }


    @Override
    public User findByEmail(String email) {
        return users.getOrDefault(email, null);
    }
}
