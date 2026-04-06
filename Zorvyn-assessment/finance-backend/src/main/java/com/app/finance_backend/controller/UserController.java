package com.app.finance_backend.controller;

import java.util.ArrayList;
import java.util.List;
import com.app.finance_backend.model.User;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	 private List<User> users = new ArrayList<>();

	@GetMapping("/users")
		public List<User> getUsers(){
			return users;
		}
	@PostMapping("/users")
	public String addUser(@RequestBody User user) {
		users.add(user);
		return "User added successfully";
	}
	@DeleteMapping("/users/{id}")
	public String deleteUser(@PathVariable int id) {
		for(User user : users) {
			if(user.getId() == id) {
				users.remove(user);
				return "User deleted successfully";
			}
		}
		return "User not found";
	}
	@PutMapping("/users/{id}")
	public String updateUser(@PathVariable int id, @RequestBody User updatedUser) {
		for(User user: users) {
			if(user.getId()== id) {
				user.setName(updatedUser.getName());
				user.setRole(updatedUser.getRole());
				user.setActive(updatedUser.isActive());
				return "User updated successfully";
				
			}
		}
		return "User not found";
	}
	}

