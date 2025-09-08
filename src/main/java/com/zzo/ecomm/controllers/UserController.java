package com.zzo.ecomm.controllers;

import com.zzo.ecomm.entities.User;
import com.zzo.ecomm.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService userService;

    // ✅ Spring will inject UserService here
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
