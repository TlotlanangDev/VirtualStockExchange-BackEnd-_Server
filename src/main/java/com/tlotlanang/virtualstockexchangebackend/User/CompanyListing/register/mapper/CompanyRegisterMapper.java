package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;

public interface CompanyRegisterMapper {

    CompanyRegisterRequest fromDto(CompanyRegisterDto companyRegisterDto);
    CompanyRegisterResponseDto toDto(CompanyRegisterEntity companyRegisterEntity);

}
