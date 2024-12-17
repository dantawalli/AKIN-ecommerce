package com.akin.ecommerce.service;

import com.akin.ecommerce.exception.UserNotFoundException;
import com.akin.ecommerce.model.User;
import com.akin.ecommerce.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
    public User getUser(Long userId) {
        return userRepository.findById(userId).get();
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User updateUser(UUID userId, User user) {
        User dbUser = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException("User not found with ID: " + userId));

        dbUser.setFirstName(user.getFirstName());
        dbUser.setMiddleName(user.getMiddleName());
        dbUser.setLastName(user.getLastName());
        dbUser.setUsername(user.getUsername());
        dbUser.setEmail(user.getEmail());
        dbUser.setPassword(user.getPassword());

        return userRepository.save(dbUser);
    }
    public void deleteUser(UUID userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            userRepository.delete(user.get());
        } else {
            throw new UserNotFoundException("User not found with ID: " + userId);
        }
    }
}
