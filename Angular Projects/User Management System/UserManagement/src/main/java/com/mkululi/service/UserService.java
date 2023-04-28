package com.mkululi.service;

import com.mkululi.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    User addUser( User user);
}
