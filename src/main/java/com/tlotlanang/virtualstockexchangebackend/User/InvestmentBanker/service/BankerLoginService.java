package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerLoginEntity;

public interface BankerLoginService {

    BankerLoginEntity loginUser(BankerLoginRequest bankerLoginRequest);
}
