package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.Investor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface InvestorSelectsBrokerService {

    Slice<Investor>getBrokersList(Pageable pageable);
    Investor viewByEmail(String emailAddress);
}
