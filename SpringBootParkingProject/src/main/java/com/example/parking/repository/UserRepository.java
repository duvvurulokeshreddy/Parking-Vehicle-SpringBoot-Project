package com.example.parking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.parking.model.User;


public interface UserRepository extends JpaRepository<User, Long>{
	
	Optional<User> findByusername(String username);


}
