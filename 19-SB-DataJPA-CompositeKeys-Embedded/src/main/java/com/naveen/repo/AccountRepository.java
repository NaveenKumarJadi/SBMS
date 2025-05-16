package com.naveen.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.naveen.entity.Account;
import com.naveen.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{

}
