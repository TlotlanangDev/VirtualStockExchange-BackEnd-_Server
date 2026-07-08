package com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorRegisterEntity;

public interface InvestorRegisterMapper {

    InvestorRegisterRequest fromDto(InvestorRegisterDto investorRegisterDto);
    InvestorRegisterResponseDto toDto(InvestorRegisterEntity investorRegisterEntity);

}
