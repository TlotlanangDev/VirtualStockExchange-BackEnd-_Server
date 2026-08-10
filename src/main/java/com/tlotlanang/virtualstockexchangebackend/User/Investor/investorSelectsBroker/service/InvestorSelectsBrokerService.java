package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.InvestorSelectsBrokerEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface InvestorSelectsBrokerService {

    Slice<InvestorSelectsBrokerEntity>getBrokersList(Pageable pageable);
    InvestorSelectsBrokerEntity viewByEmail(String emailAddress);
}
