package org.cris.controller;

import org.cris.entity.User;
import org.cris.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;

	@PostMapping("/register")
	public String register(@RequestBody User user) {
		System.out.println("The data received is " + user);
		userRepository.save(user);
		return "Registration Successful";
	}
}
