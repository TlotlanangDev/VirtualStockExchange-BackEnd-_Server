package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.entity.CompanyListingEntity;

public interface CompanyListingMapper {

    CompanyListingRequest fromDto(CompanyListingDto companyListingDto);
    CompanyListingResponseDto toDto(CompanyListingEntity companyListingEntity);
}
