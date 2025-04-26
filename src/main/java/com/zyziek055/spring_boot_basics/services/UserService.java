package com.zyziek055.spring_boot_basics.services;

import com.zyziek055.spring_boot_basics.entities.Address;
import com.zyziek055.spring_boot_basics.entities.Category;
import com.zyziek055.spring_boot_basics.entities.Product;
import com.zyziek055.spring_boot_basics.entities.User;
import com.zyziek055.spring_boot_basics.repositories.AddressRepository;
import com.zyziek055.spring_boot_basics.repositories.ProfileRepository;
import com.zyziek055.spring_boot_basics.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;
    private final AddressRepository addressRepository;
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

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
        var user = userRepository.findById(1L).orElseThrow();
        System.out.println(user.getEmail());
    }

    public void fetchAddress() {
        var address = addressRepository.findById(1L).orElseThrow();

    }

    public void persistRelated() {
        var user = User.builder().name("John").email("<EMAIL>").password("<PASSWORD>").build();

        var address = Address.builder().street("123 Main St").city("Springfield").zip("12345").state("MA").build();

        user.addAddress(address);

        userRepository.save(user);
    }

    @Transactional
    public void deleteRelated() {
        var user = userRepository.findById(3L).orElseThrow();
        var address = user.getAddresses().getFirst();

        user.removeAddress(address);
        userRepository.save(user);
    }

    @Transactional
    public void manageProducts() {
        productRepository.deleteById(4L);
    }

    @Transactional
    public void updateProductPrices() {
        productRepository.updatePriceByCategory(BigDecimal.valueOf(10), (byte) 1);
    }

    @Transactional
    public void fetchProducts() {
        var products = productRepository.findProductByPrice(BigDecimal.valueOf(10), BigDecimal.valueOf(100));
        products.forEach(System.out::println);
    }

    @Transactional
    public void fetchUsers() {
        var users = userRepository.findAllWithAddresses();
        users.forEach(u -> {
            System.out.println(u);
            u.getAddresses().forEach(System.out::println);
        });
    }
}
