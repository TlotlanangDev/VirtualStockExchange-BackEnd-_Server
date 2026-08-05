package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.entity.CompanyRegisterEntity;

public interface CompanyRegisterMapper {

    CompanyRegisterRequest fromDto(CompanyRegisterDto companyRegisterDto);
    CompanyRegisterResponseDto toDto(CompanyRegisterEntity companyRegisterEntity);

}
