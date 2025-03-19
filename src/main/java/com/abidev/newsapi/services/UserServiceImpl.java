package com.abidev.newsapi.services;

import com.abidev.newsapi.dto.UserDTO;
import com.abidev.newsapi.entity.User;
import com.abidev.newsapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO getUserByUsername(String username) {
        Optional<User> user = userRepository.findByUsername(username);
        return user.map(value -> new UserDTO(value.getUsername(), value.getFullName())).orElse(null);
    }
}
