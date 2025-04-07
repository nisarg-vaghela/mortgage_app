package com.mortgage.domain.valueobject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class Email {
    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Invalid email format")
    private final String email;

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}