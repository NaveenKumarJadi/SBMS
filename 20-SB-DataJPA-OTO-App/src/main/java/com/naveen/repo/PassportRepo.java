package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Passport;

public interface PassportRepo extends JpaRepository<Passport, Integer> {

}
