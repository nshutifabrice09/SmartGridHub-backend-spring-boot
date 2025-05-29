package com.microgrid.management.service;

import com.microgrid.management.model.Microgrid;
import com.microgrid.management.model.User;
import com.microgrid.management.repository.MicrogridRepository;
import com.microgrid.management.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{
    private final UserRepository userRepository;
    private final MicrogridRepository microgridRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository, MicrogridRepository microgridRepository) {
        this.userRepository = userRepository;
        this.microgridRepository = microgridRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public User saveUser(User user, Long microgridId) {
        Microgrid microgrid = microgridRepository.findMicrogridById(microgridId);
        user.setMicrogrid(microgrid);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        User existUser = userRepository.findUserById(id);
        if(existUser != null){
            existUser.setName(user.getName());
            existUser.setEmail(user.getEmail());
            existUser.setPassword(user.getPassword());
            existUser.setRole(user.getRole());
            return userRepository.save(existUser);
        }
        return null;
    }

    @Override
    public void removeUserById(Long id) {
        userRepository.deleteById(id);
    }
}
