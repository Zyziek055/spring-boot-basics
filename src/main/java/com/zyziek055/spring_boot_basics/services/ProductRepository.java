package com.zyziek055.spring_boot_basics.services;

import com.zyziek055.spring_boot_basics.dtos.ProductSummary;
import com.zyziek055.spring_boot_basics.dtos.ProductSummaryDTO;
import com.zyziek055.spring_boot_basics.entities.Category;
import com.zyziek055.spring_boot_basics.entities.Product;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

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

    //Find products whose prices are in a given range and sort them by name
    //@Query(value = "select * from products p where p.price between :min and :max order by p.name", nativeQuery = true
    //List<Product> findProducts(@Param("min") BigDecimal min, @Param("max") BigDecimal max);

    @Procedure(name = "findProductByPrice")
    List<Product> findProductByPrice(BigDecimal min, BigDecimal max);

    @Query("select count(*) from Product p where p.price between :min and :max")
    long countProduct(@Param("min") BigDecimal min, @Param("max") BigDecimal max);

    @Modifying
    @Query("update Product p set p.price = :price where p.category.id = :categoryId")
    void updatePriceByCategory(BigDecimal price, Byte categoryId);

    @Query("select new com.zyziek055.spring_boot_basics.dtos.ProductSummaryDTO(p.id, p.name) from Product p where p.category = :category")
    List<ProductSummaryDTO> findByCategory(@Param("category") Category category);
}