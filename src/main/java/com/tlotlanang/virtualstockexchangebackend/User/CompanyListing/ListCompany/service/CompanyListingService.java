package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.entity.CompanyListingEntity;

public interface CompanyListingService {

    CompanyListingEntity listCompany(CompanyListingRequest companyListingRequest);
}
