package com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorLoginEntity;

public interface InvestorLoginMapper {
    InvestorLoginRequest fromDto(InvestorLoginDto investorLoginDto);
    InvestorLoginResponseDto toDto(InvestorLoginEntity investorLoginEntity);
}
