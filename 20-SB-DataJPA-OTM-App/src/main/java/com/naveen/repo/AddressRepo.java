package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
