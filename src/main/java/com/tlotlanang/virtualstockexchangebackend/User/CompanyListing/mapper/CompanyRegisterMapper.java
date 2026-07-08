package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyRegisterEntity;

public interface CompanyRegisterMapper {

    CompanyRegisterRequest fromDto(CompanyRegisterDto companyRegisterDto);
    CompanyRegisterResponseDto toDto(CompanyRegisterEntity companyRegisterEntity);

}
