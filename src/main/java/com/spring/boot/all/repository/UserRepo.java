package com.spring.boot.all.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.all.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String> {

}
