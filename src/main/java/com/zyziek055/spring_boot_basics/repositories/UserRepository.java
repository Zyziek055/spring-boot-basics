package com.zyziek055.spring_boot_basics.repositories;
import java.util.List;
import java.util.Optional;
import com.zyziek055.spring_boot_basics.entities.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    @EntityGraph(attributePaths = {"tags", "addresses"})
    Optional<User> findByEmail(String email);

    @EntityGraph(attributePaths = {"addresses"})
    @Query("select u from User u")
    List<User> findAllWithAddresses();
}
