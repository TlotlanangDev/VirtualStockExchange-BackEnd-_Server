package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegisterService {

    @Autowired
    private userRegisterRepository userregisterrepository;
    @Autowired
    private UserRegisterMapper userRegisterMapper;

    @Transactional
    public UsersDto dtoConverter(UsersDto usersDto){

        UserRegisterEntity userRegisterEntity = userRegisterMapper.toEntity(usersDto);
        UserRegisterEntity savedToEntity = userregisterrepository.save(userRegisterEntity);

        return userRegisterMapper.toDto(savedToEntity);
    }
}
