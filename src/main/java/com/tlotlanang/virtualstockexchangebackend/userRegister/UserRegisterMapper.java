package com.tlotlanang.virtualstockexchangebackend.userRegister;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRegisterMapper {

    UserRegisterEntity toEntity(UsersDto usersDto);
    UsersDto toDto(UserRegisterEntity userRegisterEntity);

}
