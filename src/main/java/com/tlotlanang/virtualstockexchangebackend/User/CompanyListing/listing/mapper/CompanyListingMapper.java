package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.entity.CompanyListingEntity;

public interface CompanyListingMapper {

    CompanyListingRequest fromDto(CompanyListingDto companyListingDto);
    CompanyListingResponseDto toDto(CompanyListingEntity companyListingEntity);
}
