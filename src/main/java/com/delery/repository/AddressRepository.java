package com.delery.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.delery.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

	
}
