package com.zyziek055.spring_boot_basics.repositories;

import com.zyziek055.spring_boot_basics.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {

}