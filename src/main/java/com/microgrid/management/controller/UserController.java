package com.microgrid.management.controller;

import com.microgrid.management.model.User;
import com.microgrid.management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {
    private final UserService userService;


    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user/{microgridId}")
    public User saveUser(@RequestBody User user, @PathVariable ("microgridId") Long microgridId){
        return userService.saveUser(user, microgridId);
    }
    @GetMapping("/users")
    public List<User>userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable ("id") Long id){
        return userService.getUserById(id);
    }

    @PutMapping("/update/user/{id}")
    public User updateUser(@PathVariable ("id") Long id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/user/{id}")
    public void removeUser(@PathVariable ("id") Long id){
        userService.removeUserById(id);
    }
}
