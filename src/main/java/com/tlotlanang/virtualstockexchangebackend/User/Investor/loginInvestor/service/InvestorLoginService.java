package com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.service;


import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.entity.InvestorLoginEntity;

public interface InvestorLoginService {

    InvestorLoginEntity loginUser(InvestorLoginRequest investorLoginRequest);
}
