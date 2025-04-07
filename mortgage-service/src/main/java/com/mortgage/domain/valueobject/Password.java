package com.mortgage.domain.valueobject;

import jakarta.validation.constraints.NotBlank;

public class Password {
    @NotBlank(message = "Password cannot be blank")
    private final String password;

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}