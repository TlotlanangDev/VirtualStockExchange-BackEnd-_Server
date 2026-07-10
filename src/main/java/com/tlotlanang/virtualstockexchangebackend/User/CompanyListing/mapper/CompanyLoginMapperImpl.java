package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyLoginEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyLoginMapperImpl implements CompanyLoginMapper {
    @Override
    public CompanyLoginRequest fromDto(CompanyLoginDto companyLoginDto) {
        return new CompanyLoginRequest(
                   companyLoginDto.emailAddress(),
                   companyLoginDto.passWord()
        );
    }

    @Override
    public CompanyLoginResponseDto toDto(CompanyLoginEntity companyLoginEntity) {
        return new CompanyLoginResponseDto(
                   companyLoginEntity.getEmailAddress(),
                   companyLoginEntity.getPassWord()
        );
    }
}
