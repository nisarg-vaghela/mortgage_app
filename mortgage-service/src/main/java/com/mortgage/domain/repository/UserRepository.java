package com.mortgage.domain.repository;

import com.mortgage.domain.entity.User;
import com.mortgage.domain.valueobject.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(Email email);
}