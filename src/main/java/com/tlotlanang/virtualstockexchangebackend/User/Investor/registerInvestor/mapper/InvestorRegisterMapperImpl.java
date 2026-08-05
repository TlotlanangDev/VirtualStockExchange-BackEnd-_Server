package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.entity.InvestorRegisterEntity;
import org.springframework.stereotype.Component;

@Component
public class InvestorRegisterMapperImpl implements InvestorRegisterMapper {
    @Override
    public InvestorRegisterRequest fromDto(InvestorRegisterDto investorRegisterDto) {
        return new InvestorRegisterRequest(
                investorRegisterDto.name(),
                investorRegisterDto.surName(),
                investorRegisterDto.dateOfBirth(),
                investorRegisterDto.phoneNumber(),
                investorRegisterDto.emailAddress(),
                investorRegisterDto.passWord());
    }

    @Override
    public InvestorRegisterResponseDto toDto(InvestorRegisterEntity investorRegisterEntity) {
        return new InvestorRegisterResponseDto(
                investorRegisterEntity.getUuid(),
                investorRegisterEntity.getName(),
                investorRegisterEntity.getSurName(),
                investorRegisterEntity.getDateOfBirth(),
                investorRegisterEntity.getPhoneNumber(),
                investorRegisterEntity.getEmailAddress()
                //investorRegisterEntity.getPassWord()
        );
    }
}
