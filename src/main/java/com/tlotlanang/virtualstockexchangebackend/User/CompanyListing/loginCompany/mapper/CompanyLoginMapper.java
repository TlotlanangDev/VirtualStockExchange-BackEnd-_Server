package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.entity.CompanyLoginEntity;

public interface CompanyLoginMapper {
    CompanyLoginRequest fromDto(CompanyLoginDto companyLoginDto);
    CompanyLoginResponseDto toDto(CompanyLoginEntity companyLoginEntity);
}
