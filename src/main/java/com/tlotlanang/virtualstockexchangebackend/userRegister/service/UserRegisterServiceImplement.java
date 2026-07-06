package com.tlotlanang.virtualstockexchangebackend.userRegister.service;

import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.userRegister.repository.UserRegisterRepository;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRegisterServiceImplement implements UserRegisterService {

    @Autowired
    private UserRegisterRepository userregisterrepository;


    @Override
    public UserRegisterEntity createUser(UserRegisterRequest userRegisterRequest) {

        UserRegisterEntity userRegisterEntity = new UserRegisterEntity(
                null,
                userRegisterRequest.name(),
                userRegisterRequest.surName(),
                userRegisterRequest.dateOfBirth(),
                userRegisterRequest.phoneNumber(),
                userRegisterRequest.emailAddress(),
                userRegisterRequest.passWord()
        );
        return userregisterrepository.save(userRegisterEntity);
    }

}
