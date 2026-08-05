package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.entity.InvestorRegisterEntity;

public interface InvestorRegisterService {

    InvestorRegisterEntity createUser(InvestorRegisterRequest investorRegisterRequest);
}
