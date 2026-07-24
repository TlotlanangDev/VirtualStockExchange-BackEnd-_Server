package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.entity.BankerLoginEntity;

public interface BankerLoginMapper {
    BankerLoginRequest fromDto(BankerLoginDto bankerLoginDto);
    BankerLoginResponseDto toDto(BankerLoginEntity bankerLoginEntity);
}
