package com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorLoginEntity;
import org.springframework.stereotype.Component;

@Component
public class InvestorLoginMapperImpl implements InvestorLoginMapper {
    @Override
    public InvestorLoginRequest fromDto(InvestorLoginDto investorLoginDto) {
        return new InvestorLoginRequest(
                investorLoginDto.emailAddress(),
                investorLoginDto.passWord()
        );
    }

    @Override
    public InvestorLoginResponseDto toDto(InvestorLoginEntity investorLoginEntity) {
        return new InvestorLoginResponseDto(
                investorLoginEntity.getEmailAddress(),
                investorLoginEntity.getPassWord()
        );
    }
}
