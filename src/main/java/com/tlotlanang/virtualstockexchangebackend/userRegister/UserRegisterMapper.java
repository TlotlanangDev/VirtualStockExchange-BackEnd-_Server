package com.tlotlanang.virtualstockexchangebackend.userRegister;

import ch.qos.logback.core.model.ComponentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRegisterMapper {

    UserRegisterEntity toEntity(UsersDto usersDto);
    UsersDto toDto(UserRegisterEntity userRegisterEntity);

}
