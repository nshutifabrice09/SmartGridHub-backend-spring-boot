package com.microgrid.management.service;

import com.microgrid.management.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById (Long id);
    User saveUser(User user, Long microgridId);
    User updateUser (Long id, User user);
    void removeUserById(Long id);
}
