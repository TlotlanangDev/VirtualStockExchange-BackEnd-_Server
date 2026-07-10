package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyLoginEntity;

public interface CompanyLoginMapper {
    CompanyLoginRequest fromDto(CompanyLoginDto companyLoginDto);
    CompanyLoginResponseDto toDto(CompanyLoginEntity companyLoginEntity);
}
