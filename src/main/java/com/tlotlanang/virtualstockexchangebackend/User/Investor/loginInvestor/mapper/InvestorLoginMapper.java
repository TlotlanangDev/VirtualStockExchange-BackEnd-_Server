package com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain.InvestorLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain.InvestorLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.entity.InvestorLoginEntity;

public interface InvestorLoginMapper {
    InvestorLoginRequest fromDto(InvestorLoginDto investorLoginDto);
    InvestorLoginResponseDto toDto(InvestorLoginEntity investorLoginEntity);
}
