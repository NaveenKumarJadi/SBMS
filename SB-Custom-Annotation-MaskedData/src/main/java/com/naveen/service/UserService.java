package com.naveen.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.naveen.dto.AccountDetails;
import com.naveen.dto.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserService {

	public List<User> getAllUsers() {

		log.info("Entering UserService.getAllUsers method");
		User user1 = new User(7799, "sai", "666555444999", "1234567890", 27, "shiva", "sai@123",
				List.of(new AccountDetails("SAI SHIVA", "333666999000", "SAVING"),
						new AccountDetails("SAI SHIVA", "222555888000", "CURRENT")));
		log.info("UserService.getAllUsers method - user1 :: {}", user1);

		User user2 = new User(5622, "Srinu", "777888999666", "1122334455", 35, "Kiran", "srinu@619",
				List.of(new AccountDetails("SRINU KIRAN", "5544332211", "SAVING")));
		log.info("UserService.getAllUsers method - user2 :: {}", user2);

		log.info("Exiting UserService.getAllUsers method");
		return Stream.of(user1, user2).collect(Collectors.toList());
	}

	public User getUser(int id) {
		return getAllUsers().stream().filter(user -> user.getId() == id).findFirst()
				.orElseThrow(() -> new RuntimeException("user not found"));
	}
}