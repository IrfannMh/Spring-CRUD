package com.irfanm.crudapp.controllers;

import com.irfanm.crudapp.models.User;
import com.irfanm.crudapp.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//final field/variable
@RequiredArgsConstructor
@RequestMapping("/api/users/")
public class UserController {

    private final UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        List<User> data = userService.getUsers();
        return data;
    }

    @PostMapping("/{id}")
    public String createUser(@RequestBody User user, @PathVariable String id){
        userService.createUser(user);
        return "data berhasil ditambahkan";
    }

    @PutMapping("/{id}")
    public String updateUser(@RequestBody User user, @PathVariable String id){
        userService.updateUser(user, id);
        return "data berhasil diubah";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable String id){
        userService.deleteUser(id);
        return "data berhasil dihapus";
    }
}
