package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.entity.CompanyLoginEntity;
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
