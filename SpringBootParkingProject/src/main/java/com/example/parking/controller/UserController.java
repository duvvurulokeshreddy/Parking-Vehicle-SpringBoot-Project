package com.example.parking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.parking.model.User;
import com.example.parking.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	 
	@Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

//    @GetMapping("/username")
//    public User getUserByUsername(@PathVariable String username) {
//    	System.out.println(username);
//        return userService.findByUsername(username);
//    }
    
    @PostMapping("/username")
    public User getUserByUsername(@RequestBody User user) {
    	System.out.println(user);
    	System.out.println(user.getUsername());
    	User useww=userService.findByUsername(user.getUsername());
    	System.out.println(useww.getUsername());
    	return useww;
    }
}
