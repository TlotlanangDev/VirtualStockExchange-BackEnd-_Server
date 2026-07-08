package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyRegisterEntity;

public interface CompanyRegisterService {

    CompanyRegisterEntity createUser(CompanyRegisterRequest companyRegisterRequest);



}
