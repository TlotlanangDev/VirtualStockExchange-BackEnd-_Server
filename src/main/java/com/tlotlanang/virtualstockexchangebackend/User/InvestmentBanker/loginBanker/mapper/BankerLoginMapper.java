package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.entity.BankerLoginEntity;

public interface BankerLoginMapper {
    BankerLoginRequest fromDto(BankerLoginDto bankerLoginDto);
    BankerLoginResponseDto toDto(BankerLoginEntity bankerLoginEntity);
}
