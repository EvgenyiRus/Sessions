package com.example.sessions;

import com.example.sessions.model.User;

public class AuthorizedUser extends org.springframework.security.core.userdetails.User{
    private User user;

    public AuthorizedUser(User user) {
        super(user.getLogin(), user.getPassword(), user.getRoles());
        this.user = user;
    }

    public long getId() {
        return user.getId();
    }
}
