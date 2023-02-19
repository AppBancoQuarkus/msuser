package com.nttd.service;

import com.nttd.dto.ResponseDto;
import com.nttd.dto.UserDto;


public interface UserService {

    public ResponseDto getAllUser(UserDto userDto);

    public ResponseDto addUser(UserDto userDto);

    public ResponseDto updateUser(long id,UserDto userDto);

}
