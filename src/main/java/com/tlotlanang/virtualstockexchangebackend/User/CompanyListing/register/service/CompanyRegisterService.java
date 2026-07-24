package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;

public interface CompanyRegisterService {

    CompanyRegisterEntity createUser(CompanyRegisterRequest companyRegisterRequest);



}
