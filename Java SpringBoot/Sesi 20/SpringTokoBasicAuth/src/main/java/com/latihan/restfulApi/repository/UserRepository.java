package com.latihan.restfulApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.latihan.restfulApi.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	 User findByUsername(String username);
	

}
