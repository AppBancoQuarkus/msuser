package com.nttd.service;

import com.nttd.dto.ResponseDto;
import com.nttd.dto.UserDto;

import io.smallrye.mutiny.Uni;

public interface UserService {

    public Uni<ResponseDto> getAllUser(UserDto userDto);

    public Uni<ResponseDto> addUser(UserDto userDto);

    public Uni<ResponseDto> updateUser(long id,UserDto userDto);

}
