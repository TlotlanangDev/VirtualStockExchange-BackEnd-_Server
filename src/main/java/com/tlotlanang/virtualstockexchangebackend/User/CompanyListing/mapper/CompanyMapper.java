package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyEntity;

public interface CompanyMapper {

    CompanyRequest fromDto(CompanyDto companyDto);
    CompanyResponseDto toDto(CompanyEntity companyEntity);

}
