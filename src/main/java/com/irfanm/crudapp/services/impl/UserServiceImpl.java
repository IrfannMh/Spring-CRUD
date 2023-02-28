package com.irfanm.crudapp.services.impl;

import com.irfanm.crudapp.models.User;
import com.irfanm.crudapp.repository.UserRepository;
import com.irfanm.crudapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        List<User> data = userRepository.findAll();
        return data;
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser() {

    }

    @Override
    public void deleteUser() {

    }
}
