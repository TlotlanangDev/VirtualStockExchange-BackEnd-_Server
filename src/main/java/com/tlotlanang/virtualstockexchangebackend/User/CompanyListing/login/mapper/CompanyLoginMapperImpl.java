package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.entity.CompanyLoginEntity;
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
