package com.tlotlanang.virtualstockexchangebackend.User.Investor.service;


import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorLoginEntity;

public interface InvestorLoginService {

    InvestorLoginEntity loginUser(InvestorLoginRequest investorLoginRequest);
}
