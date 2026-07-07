package com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorEntity;
import org.springframework.stereotype.Component;

@Component
public class InvestorMapperImpl implements InvestorMapper {
    @Override
    public InvestorRequest fromDto(InvestorDto investorDto) {
        return new InvestorRequest(
                investorDto.name(),
                investorDto.surName(),
                investorDto.dateOfBirth(),
                investorDto.phoneNumber(),
                investorDto.emailAddress(),
                investorDto.passWord());
    }

    @Override
    public InvestorResponseDto toDto(InvestorEntity investorEntity) {
        return new InvestorResponseDto(
                investorEntity.getUuid(),
                investorEntity.getName(),
                investorEntity.getSurName(),
                investorEntity.getDateOfBirth(),
                investorEntity.getPhoneNumber(),
                investorEntity.getEmailAddress()
                //investorEntity.getPassWord()
        );
    }
}
