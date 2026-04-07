package com.fsadproject.ps30.controller;

import com.fsadproject.ps30.entity.User;
import com.fsadproject.ps30.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")  // ✅ allow React frontend
@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService service;

    // ✅ constructor injection (no Lombok needed)
    public UserController(UserService service) {
        this.service = service;
    }

    // ✅ create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return service.save(user);
    }

    // ✅ get all users
    @GetMapping
    public List<User> getUsers() {
        return service.getAll();
    }
}