package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.service;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.entity.BankerLoginEntity;

public interface BankerLoginService {

    BankerLoginEntity loginUser(BankerLoginRequest bankerLoginRequest);
}
