package com.nttd.service.impl;

import com.nttd.dto.ResponseDto;
import com.nttd.dto.UserDto;
import com.nttd.service.UserService;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServiceImpl  implements UserService {




    @Override
    public ResponseDto getAllUser(UserDto userDto) {
        // UserEntity UserEntity = new UserEntity();
        return null;//UserEntity.find(null, null);
    }

    @Override
    public ResponseDto addUser(UserDto userDto) {
        return null;
    }
    
    @Override
    public ResponseDto updateUser(long id, UserDto userDto) {
        return null;
    }
}
