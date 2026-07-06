package com.tlotlanang.virtualstockexchangebackend.userRegister.service;

import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;

public interface UserRegisterService {

    UserRegisterEntity createUser(UserRegisterRequest userRegisterRequest);
}
