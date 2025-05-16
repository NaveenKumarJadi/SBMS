package com.naveen.controllere;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naveen.model.User;
import com.naveen.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<User> save(@RequestBody User user) {
		return ResponseEntity.ok(userService.saveUser(user));
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		Optional<User> user = userService.getUserById(id);
		return user.isPresent() ? ResponseEntity.ok(user.get()) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		userService.deleteUser(id);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	public ResponseEntity<?> getAll() {
		return ResponseEntity.ok(userService.getAllUsers());
	}
}

// http://localhost:8080/api/users/9
// http://localhost:8080/api/users
