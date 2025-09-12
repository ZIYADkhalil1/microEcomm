package com.zzo.ecomm.controllers;

import com.zzo.ecomm.DTOs.UsersDTO;
import com.zzo.ecomm.entities.User;
import com.zzo.ecomm.services.UserService;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    
    @PostMapping("/addUser")
    public String addUser(@RequestBody UsersDTO user) {
    	userService.addUser(user);
    	return "User Saved Succesfully";
    }
}
