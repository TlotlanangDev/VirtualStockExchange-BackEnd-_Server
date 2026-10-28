package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.Investor;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerResponse;

public interface InvestorSelectsBrokerMapper {

    InvestorSelectsBrokerRequest fromDto(InvestorSelectsBrokerDto investorSelectsBrokerDto);
    InvestorSelectsBrokerResponse toDto(Investor investor);
}
