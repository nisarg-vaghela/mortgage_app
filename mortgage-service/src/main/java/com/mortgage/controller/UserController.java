package com.mortgage.controller;

import com.mortgage.domain.entity.User;
import com.mortgage.domain.valueobject.Email;
import com.mortgage.domain.valueobject.Password;
import com.mortgage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody RegisterRequest registerRequest) {
        User registeredUser = userService.registerUser(new Email(registerRequest.getEmail()), new Password(registerRequest.getPassword()));
        return new ResponseEntity<>(registeredUser, HttpStatus.CREATED);
    }
    public static class RegisterRequest{
        private String email;
        private String password;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}