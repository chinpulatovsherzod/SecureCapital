package com.example.securecapital.dtomapper;

import com.example.securecapital.dto.UserDto;
import com.example.securecapital.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDtoMapper {
    public static UserDto fromUser(User user){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user, userDto);
        return userDto;
    }

    public static User toUser(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        return user;
    }




}
