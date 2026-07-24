package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.entity.CompanyLoginEntity;

public interface CompanyLoginMapper {
    CompanyLoginRequest fromDto(CompanyLoginDto companyLoginDto);
    CompanyLoginResponseDto toDto(CompanyLoginEntity companyLoginEntity);
}
