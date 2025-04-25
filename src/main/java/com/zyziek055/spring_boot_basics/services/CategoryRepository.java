package com.zyziek055.spring_boot_basics.services;

import com.zyziek055.spring_boot_basics.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}