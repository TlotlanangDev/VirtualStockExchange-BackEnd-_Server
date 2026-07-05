package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserRegisterService implements RegisterUserService{

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
