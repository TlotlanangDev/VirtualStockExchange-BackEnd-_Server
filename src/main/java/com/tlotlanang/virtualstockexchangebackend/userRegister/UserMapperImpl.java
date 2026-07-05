package com.tlotlanang.virtualstockexchangebackend.userRegister;

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
    public UserDto toDto(UserRegisterEntity userRegisterEntity) {
        return new UserDto(
                userRegisterEntity.getUuid(),
                userRegisterEntity.getName(),
                userRegisterEntity.getSurName(),
                userRegisterEntity.getDateOfBirth(),
                userRegisterEntity.getPhoneNumber(),
                userRegisterEntity.getEmailAddress(),
                userRegisterEntity.getPassWord()
        );
    }
}
