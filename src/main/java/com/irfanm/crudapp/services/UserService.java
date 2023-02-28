package com.irfanm.crudapp.services;

import com.irfanm.crudapp.models.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUser(String id);

    void createUser(User user);

    void updateUser(User user, String id);
    void deleteUser(String id);

}
