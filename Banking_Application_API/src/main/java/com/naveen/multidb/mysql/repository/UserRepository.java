package com.naveen.multidb.mysql.repository;

import com.naveen.multidb.mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
