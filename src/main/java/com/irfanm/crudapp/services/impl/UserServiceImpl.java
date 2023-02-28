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
    public User getUser(String id) {
        userRepository.findById(id);
        return null;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user, String id) {
        final User result = getUser(id);
        if (result !=  null){
            result.setEmail(user.getEmail());
            result.setName(user.getName());
            result.setPassword(user.getPassword());
            userRepository.save(user);
        }
    }

    @Override
    public void deleteUser(String id) {
        final User result = getUser(id);
        if (result !=  null){
            userRepository.deleteById(id);
        }
    }

}
