package com.zyziek055.spring_boot_basics.repositories;

import com.zyziek055.spring_boot_basics.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
