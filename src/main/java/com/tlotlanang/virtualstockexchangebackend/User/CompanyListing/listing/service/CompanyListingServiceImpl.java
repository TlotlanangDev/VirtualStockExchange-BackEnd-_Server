package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.entity.CompanyListingEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.repository.CompanyListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyListingServiceImpl implements CompanyListingService{

    @Autowired
    private CompanyListingRepository companyListingRepository;

    @Override
    public CompanyListingEntity listCompany(CompanyListingRequest companyListingRequest) {

        CompanyListingEntity companyListingEntity = new CompanyListingEntity(
                companyListingRequest.id(),
                companyListingRequest.companyName(),
                companyListingRequest.registrationNumber(),
                companyListingRequest.stockShare(),
                companyListingRequest.pricePerShare()
        );
        return companyListingRepository.save(companyListingEntity);
    }
}
