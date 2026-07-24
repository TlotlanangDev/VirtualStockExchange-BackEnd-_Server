package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.entity.BankerLoginEntity;
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
