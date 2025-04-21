package com.zyziek055.spring_boot_basics;

public interface UserRepository {
    void save(User user);
    User findByEmail(String email);
}
