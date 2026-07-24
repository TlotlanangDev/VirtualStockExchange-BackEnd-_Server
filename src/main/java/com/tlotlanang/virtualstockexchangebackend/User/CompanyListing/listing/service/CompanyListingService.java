package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.entity.CompanyListingEntity;

public interface CompanyListingService {

    CompanyListingEntity listCompany(CompanyListingRequest companyListingRequest);
}
