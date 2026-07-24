package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.entity.CompanyListingEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyListingMapperImpl implements CompanyListingMapper{
    @Override
    public CompanyListingRequest fromDto(CompanyListingDto companyListingDto) {
        return new CompanyListingRequest(
                companyListingDto.id(),
                companyListingDto.companyName(),
                companyListingDto.registrationNumber(),
                companyListingDto.stockShare(),
                companyListingDto.pricePerShare());
    }

    @Override
    public CompanyListingResponseDto toDto(CompanyListingEntity companyListingEntity) {
        return new CompanyListingResponseDto(
                companyListingEntity.getId(),
                companyListingEntity.getCompanyName(),
                companyListingEntity.getRegistrationNumber(),
                companyListingEntity.getStockShare(),
                companyListingEntity.getPricePerShare());
    }
}
