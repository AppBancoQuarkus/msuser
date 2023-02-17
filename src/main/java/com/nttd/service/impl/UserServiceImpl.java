package com.nttd.service.impl;

import com.nttd.dto.ResponseDto;
import com.nttd.dto.UserDto;
import com.nttd.entity.UserEntity;
import com.nttd.service.UserService;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserServiceImpl  implements UserService {




    @Override
    public Uni<ResponseDto> getAllUser(UserDto userDto) {

        UserEntity UserEntity = new UserEntity();
        return null;//UserEntity.find(null, null);
    }

    @Override
    public Uni<ResponseDto> addUser(UserDto userDto) {
 
        return null;
    }
    
    @Override
    public Uni<ResponseDto> updateUser(long id, UserDto userDto) {
        return null;
    }
}
