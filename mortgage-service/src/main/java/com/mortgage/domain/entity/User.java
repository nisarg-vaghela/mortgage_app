package com.mortgage.domain.entity;

import com.mortgage.domain.valueobject.Email;
import com.mortgage.domain.valueobject.Password;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Email email;

    @Embedded
    private Password password;

    public User(Email email, Password password) {
        this.email = email;
        this.password = password;
    }
}