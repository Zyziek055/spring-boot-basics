package com.zyziek055.spring_boot_basics.services;

import com.zyziek055.spring_boot_basics.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}