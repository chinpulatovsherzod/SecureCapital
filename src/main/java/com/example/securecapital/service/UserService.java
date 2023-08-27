package com.example.securecapital.service;

import com.example.securecapital.dto.UserDto;
import com.example.securecapital.model.User;

public interface UserService {

    UserDto createUser(User user);
}
