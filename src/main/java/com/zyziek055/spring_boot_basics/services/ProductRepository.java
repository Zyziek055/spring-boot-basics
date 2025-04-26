package com.zyziek055.spring_boot_basics.services;

import com.zyziek055.spring_boot_basics.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByName(String name);
    List<Product> findByNameLike(String name);
    List<Product> findByNameNotLike(String name);
    List<Product> findByNameContaining(String name);
    List<Product> findByNameStartingWith(String name);
    List<Product> findByNameEndsWithIgnoreCase(String name);

    //Numbers
    List<Product> findByPrice(BigDecimal price);
    List<Product> findByPriceGreaterThan(BigDecimal price);
    List<Product> findByPriceBetween(BigDecimal min, BigDecimal max);

    //Null
    List<Product> findByCategoryIsNull();
    List<Product> findByCategoryIsNotNull();

    //Multiple conditions
    List<Product> findByNameAndPrice(String name, BigDecimal price);

    //Sort (OrderBy)
    List<Product> findByNameOrderByPriceDesc(String name);

    //Limit (Top/First)
    List<Product> findTop5ByNameOrderByPriceDesc(String name);
}