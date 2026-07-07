package com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorEntity;

public interface InvestorMapper {

    InvestorRequest fromDto(InvestorDto investorDto);
    InvestorResponseDto toDto(InvestorEntity investorEntity);

}
