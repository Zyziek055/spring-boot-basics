package com.zyziek055.spring_boot_basics.repositories;

import com.zyziek055.spring_boot_basics.entities.Profile;
import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
}