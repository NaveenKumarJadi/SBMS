package com.naveen.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.naveen.entity.Player;

//@Repository //Optional
public interface PlayerRepository extends CrudRepository<Player, Integer>{

}
