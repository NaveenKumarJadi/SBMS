package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Emp;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
