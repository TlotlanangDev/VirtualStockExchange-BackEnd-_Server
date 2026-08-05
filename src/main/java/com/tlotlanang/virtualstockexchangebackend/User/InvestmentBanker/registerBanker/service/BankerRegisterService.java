package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.entity.BankerRegisterEntity;

public interface BankerRegisterService {

    BankerRegisterEntity createUser(BankerRegisterRequest bankerRegisterRequest);
}
