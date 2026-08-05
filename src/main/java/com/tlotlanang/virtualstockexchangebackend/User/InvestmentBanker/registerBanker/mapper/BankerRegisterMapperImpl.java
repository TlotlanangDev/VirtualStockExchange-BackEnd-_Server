package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.domain.BankerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.registerBanker.entity.BankerRegisterEntity;
import org.springframework.stereotype.Component;

@Component
public class BankerRegisterMapperImpl implements BankerRegisterMapper {
    @Override
    public BankerRegisterRequest fromDto(BankerRegisterDto bankerRegisterDto) {
        return new BankerRegisterRequest(
                bankerRegisterDto.name(),
                bankerRegisterDto.surName(),
                bankerRegisterDto.dateOfBirth(),
                bankerRegisterDto.phoneNumber(),
                bankerRegisterDto.emailAddress(),
                bankerRegisterDto.passWord());
    }

    @Override
    public BankerRegisterResponseDto toDto(BankerRegisterEntity bankerRegisterEntity) {
        return new BankerRegisterResponseDto(
                bankerRegisterEntity.getUuid(),
                bankerRegisterEntity.getName(),
                bankerRegisterEntity.getSurName(),
                bankerRegisterEntity.getDateOfBirth(),
                bankerRegisterEntity.getPhoneNumber(),
                bankerRegisterEntity.getEmailAddress()
                //bankerRegisterEntity.getPassWord()
        );
    }
}
