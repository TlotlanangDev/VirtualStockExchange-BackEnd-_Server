package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyEntity;

public interface CompanyService {

    CompanyEntity createUser(CompanyRequest companyRequest);
}
