package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserRegisterService {

    @Autowired
    private UserRegisterRepository userregisterrepository;
    @Autowired
    private UserRegisterMapper userRegisterMapper;

    @Transactional
    public UserRegisterDto dtoConverter(UserRegisterDto userRegisterDto){

        UserRegisterEntity userRegisterEntity = userRegisterMapper.toEntity(userRegisterDto);
        UserRegisterEntity savedToEntity = userregisterrepository.save(userRegisterEntity);

        return userRegisterMapper.toDto(savedToEntity);
    }
}
