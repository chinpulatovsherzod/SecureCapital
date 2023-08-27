package com.example.securecapital.service.implementation;

import com.example.securecapital.dto.UserDto;
import com.example.securecapital.dtomapper.UserDtoMapper;
import com.example.securecapital.model.User;
import com.example.securecapital.repository.UserReposiory;
import com.example.securecapital.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserReposiory<User> userUserReposiory;
    @Override
    public UserDto createUser(User user) {
        return UserDtoMapper.fromUser(userUserReposiory.create(user));
    }
}
