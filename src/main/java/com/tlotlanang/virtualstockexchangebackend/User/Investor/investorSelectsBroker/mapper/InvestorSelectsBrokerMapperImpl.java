package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity.InvestorSelectsBrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain.InvestorSelectsBrokerResponse;
import org.springframework.stereotype.Component;

@Component
public class InvestorSelectsBrokerMapperImpl implements InvestorSelectsBrokerMapper{
    @Override
    public InvestorSelectsBrokerRequest fromDto(InvestorSelectsBrokerDto investorSelectsBrokerDto) {
        return new InvestorSelectsBrokerRequest(
                investorSelectsBrokerDto.name(),
                investorSelectsBrokerDto.surName(),
                investorSelectsBrokerDto.phoneNumber(),
                investorSelectsBrokerDto.emailAddress());
    }

    @Override
    public InvestorSelectsBrokerResponse toDto(InvestorSelectsBrokerEntity investorSelectsBrokerEntity) {
        return new InvestorSelectsBrokerResponse(
                investorSelectsBrokerEntity.getName(),
                investorSelectsBrokerEntity.getSurName(),
                investorSelectsBrokerEntity.getPhoneNumber(),
                investorSelectsBrokerEntity.getEmailAddress());
    }
}
