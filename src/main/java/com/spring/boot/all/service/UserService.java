package com.spring.boot.all.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.all.entity.User;
import com.spring.boot.all.repository.UserRepo;

@Service
public class UserService {

	@Autowired
	public UserRepo repo;

	public User insert(User user) {

		repo.save(user);

		return null;
	}

}
