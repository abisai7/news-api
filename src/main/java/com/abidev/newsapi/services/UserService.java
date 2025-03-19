package com.abidev.newsapi.services;

import com.abidev.newsapi.dto.UserDTO;

public interface UserService {

    UserDTO getUserByUsername(String username);
}
