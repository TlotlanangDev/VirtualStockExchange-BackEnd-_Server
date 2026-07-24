package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.entity.BankerRegisterEntity;

public interface BankerRegisterService {

    BankerRegisterEntity createUser(BankerRegisterRequest bankerRegisterRequest);
}
