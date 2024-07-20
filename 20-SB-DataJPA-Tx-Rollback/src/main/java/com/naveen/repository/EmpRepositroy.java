package com.naveen.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Employee;

public interface EmpRepositroy extends JpaRepository<Employee, Serializable> {

}
