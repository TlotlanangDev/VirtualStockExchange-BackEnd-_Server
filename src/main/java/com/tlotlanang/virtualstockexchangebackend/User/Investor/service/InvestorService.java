package com.tlotlanang.virtualstockexchangebackend.User.Investor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorEntity;

public interface InvestorService {

    InvestorEntity createUser(InvestorRequest investorRequest);
}
