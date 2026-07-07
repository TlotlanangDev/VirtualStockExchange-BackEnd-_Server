package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerEntity;
import org.springframework.stereotype.Component;

@Component
public class BankerMapperImpl implements BankerMapper {
    @Override
    public BankerRequest fromDto(BankerDto bankerDto) {
        return new BankerRequest(
                bankerDto.name(),
                bankerDto.surName(),
                bankerDto.dateOfBirth(),
                bankerDto.phoneNumber(),
                bankerDto.emailAddress(),
                bankerDto.passWord());
    }

    @Override
    public BankerResponseDto toDto(BankerEntity bankerEntity) {
        return new BankerResponseDto(
                bankerEntity.getUuid(),
                bankerEntity.getName(),
                bankerEntity.getSurName(),
                bankerEntity.getDateOfBirth(),
                bankerEntity.getPhoneNumber(),
                bankerEntity.getEmailAddress()
                //bankerEntity.getPassWord()
        );
    }
}
