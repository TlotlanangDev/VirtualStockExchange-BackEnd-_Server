package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.service;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.entity.BankerLoginEntity;

public interface BankerLoginService {

    BankerLoginEntity loginUser(BankerLoginRequest bankerLoginRequest);
}
