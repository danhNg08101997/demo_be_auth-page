package com.app.loginpage.controller;

import com.app.loginpage.model.Users;
import com.app.loginpage.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepo repo;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Users userData) {
        Users user=repo.findByUserId(userData.getUserId());
        return new ResponseEntity<>(user, HttpStatus.OK);    }

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Users userData) {
        Users user = repo.findByUserId(userData.getUserId());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
