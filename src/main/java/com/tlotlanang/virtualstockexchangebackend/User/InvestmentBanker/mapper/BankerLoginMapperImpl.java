package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerLoginEntity;
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
