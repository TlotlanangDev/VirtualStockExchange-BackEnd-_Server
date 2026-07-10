package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerLoginEntity;

public interface BankerLoginMapper {
    BankerLoginRequest fromDto(BankerLoginDto bankerLoginDto);
    BankerLoginResponseDto toDto(BankerLoginEntity bankerLoginEntity);
}
