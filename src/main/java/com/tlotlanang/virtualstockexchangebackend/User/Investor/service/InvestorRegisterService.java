package com.tlotlanang.virtualstockexchangebackend.User.Investor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorRegisterEntity;

public interface InvestorRegisterService {

    InvestorRegisterEntity createUser(InvestorRegisterRequest investorRegisterRequest);
}
