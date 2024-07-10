package com.example.parking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.parking.exception.UserNotFoundByNameException;
import com.example.parking.model.User;
import com.example.parking.repository.UserRepository;

@Service
public class UserService   {

	 @Autowired
	    private UserRepository userRepository;

	public User registerUser(User user) {
		
		return userRepository.save(user);
	}

	public User findByUsername(String username) {
		
		Optional<User> optional = userRepository.findByusername(username);
		
		if(optional.isEmpty())
			throw new UserNotFoundByNameException("NO user found");
		else
			return optional.get();
		
		
	}

	
	 
	 

	  
}

