package com.tlotlanang.virtualstockexchangebackend.userRegister;

public interface UserRegisterMapper {

    UserRegisterRequest fromDto(UserRegisterDto userRegisterDto);
    UserDto toDto(UserRegisterEntity userRegisterEntity);

}
