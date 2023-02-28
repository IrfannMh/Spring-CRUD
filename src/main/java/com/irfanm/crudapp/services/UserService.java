package com.irfanm.crudapp.services;

import com.irfanm.crudapp.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser();

    void createUser(User user);

    void updateUser();
    void deleteUser();
}
