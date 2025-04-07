package com.mortgage.domain.event;

import com.mortgage.domain.entity.User;

public class UserRegistered {
    private final User user;

    public UserRegistered(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}