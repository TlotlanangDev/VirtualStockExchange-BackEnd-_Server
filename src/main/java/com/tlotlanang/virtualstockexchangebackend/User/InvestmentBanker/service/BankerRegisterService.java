package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerRegisterEntity;

public interface BankerRegisterService {

    BankerRegisterEntity createUser(BankerRegisterRequest bankerRegisterRequest);
}
