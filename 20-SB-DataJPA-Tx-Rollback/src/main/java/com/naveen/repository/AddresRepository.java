package com.naveen.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Address;

public interface AddresRepository extends JpaRepository<Address, Integer> {

}
