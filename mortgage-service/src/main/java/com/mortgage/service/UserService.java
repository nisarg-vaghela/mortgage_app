package com.mortgage.service;

import com.mortgage.domain.entity.User;
import com.mortgage.domain.repository.UserRepository;
import com.mortgage.domain.valueobject.Email;
import com.mortgage.domain.valueobject.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.security.core.userdetails.User as SpringUser;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Transactional
    public User registerUser(Email email, Password password) {
        String encodedPassword = passwordEncoder.encode(password.getPassword());
        Password encodedPasswordObject = new Password(encodedPassword);
        User user = new User(email, encodedPasswordObject);
        return userRepository.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(new Email(email));
        if (user == null) {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
        return new SpringUser(user.getEmail().getEmail(), user.getPassword().getPassword(), new ArrayList<>());
    }
}