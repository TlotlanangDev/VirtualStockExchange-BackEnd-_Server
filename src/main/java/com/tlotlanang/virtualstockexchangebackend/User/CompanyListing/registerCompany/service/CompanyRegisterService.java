package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.entity.CompanyRegisterEntity;

public interface CompanyRegisterService {

    CompanyRegisterEntity createUser(CompanyRegisterRequest companyRegisterRequest);



}
