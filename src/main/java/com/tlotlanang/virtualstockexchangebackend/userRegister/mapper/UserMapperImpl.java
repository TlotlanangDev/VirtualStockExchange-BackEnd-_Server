package com.tlotlanang.virtualstockexchangebackend.userRegister.mapper;

import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserRegisterMapper{
    @Override
    public UserRegisterRequest fromDto(UserRegisterDto userRegisterDto) {
        return new UserRegisterRequest(
                userRegisterDto.name(),
                userRegisterDto.surName(),
                userRegisterDto.dateOfBirth(),
                userRegisterDto.phoneNumber(),
                userRegisterDto.emailAddress(),
                userRegisterDto.passWord());
    }

    @Override
    public UserRegisterResponseDto toDto(UserRegisterEntity userRegisterEntity) {
        return new UserRegisterResponseDto(
                userRegisterEntity.getUuid(),
                userRegisterEntity.getName(),
                userRegisterEntity.getSurName(),
                userRegisterEntity.getDateOfBirth(),
                userRegisterEntity.getPhoneNumber(),
                userRegisterEntity.getEmailAddress()
                //userRegisterEntity.getPassWord()
        );
    }
}
