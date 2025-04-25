package com.zyziek055.spring_boot_basics.services;

import com.zyziek055.spring_boot_basics.entities.User;
import com.zyziek055.spring_boot_basics.repositories.ProfileRepository;
import com.zyziek055.spring_boot_basics.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates() {
        var user = User.builder().name("John").email("<EMAIL>").password("<PASSWORD>").build();

        if (entityManager.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient or detached");

        userRepository.save(user);

        if (entityManager.contains(user))
            System.out.println("Persistent");
        else
            System.out.println("Transient or detached");
    }

    @Transactional
    public void showRelatedEntities() {
        var profile = profileRepository.findById(2L).orElseThrow();
        System.out.println(profile.getUser().getEmail());
    }
}
