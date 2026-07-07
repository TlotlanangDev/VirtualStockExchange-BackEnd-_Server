package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerEntity;

public interface BankerService {

    BankerEntity createUser(BankerRequest bankerRequest);
}
