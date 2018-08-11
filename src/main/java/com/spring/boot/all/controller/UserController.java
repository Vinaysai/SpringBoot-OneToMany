package com.spring.boot.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.all.entity.User;
import com.spring.boot.all.service.UserService;

@RestController
public class UserController {

	@Autowired
	public UserService service;

	@PostMapping(value = "/insert",produces = "application/json")
	public User insert(@RequestBody User user) {

		User users = service.insert(user);
		if (users != null) {
			System.out.println("User created:::");
		}
		return users;

	}

}
