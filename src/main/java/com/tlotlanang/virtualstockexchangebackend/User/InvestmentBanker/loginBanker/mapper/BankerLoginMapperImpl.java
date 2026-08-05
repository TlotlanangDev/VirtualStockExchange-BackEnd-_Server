package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.entity.BankerLoginEntity;
import org.springframework.stereotype.Component;

@Component
public class BankerLoginMapperImpl implements BankerLoginMapper {
    @Override
    public BankerLoginRequest fromDto(BankerLoginDto bankerLoginDto) {
        return new BankerLoginRequest(
                   bankerLoginDto.emailAddress(),
                   bankerLoginDto.passWord()
        );
    }

    @Override
    public BankerLoginResponseDto toDto(BankerLoginEntity bankerLoginEntity) {
        return new BankerLoginResponseDto(
                   bankerLoginEntity.getEmailAddress(),
                   bankerLoginEntity.getPassWord()
        );
    }
}
