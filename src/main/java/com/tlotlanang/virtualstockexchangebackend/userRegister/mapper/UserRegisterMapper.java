package com.tlotlanang.virtualstockexchangebackend.userRegister.mapper;

import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;

public interface UserRegisterMapper {

    UserRegisterRequest fromDto(UserRegisterDto userRegisterDto);
    UserRegisterResponseDto toDto(UserRegisterEntity userRegisterEntity);

}
