package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.entity.InvestorRegisterEntity;

public interface InvestorRegisterMapper {

    InvestorRegisterRequest fromDto(InvestorRegisterDto investorRegisterDto);
    InvestorRegisterResponseDto toDto(InvestorRegisterEntity investorRegisterEntity);

}
