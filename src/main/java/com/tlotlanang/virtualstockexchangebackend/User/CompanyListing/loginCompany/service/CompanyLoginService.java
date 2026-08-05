package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.entity.CompanyLoginEntity;

public interface CompanyLoginService {

    CompanyLoginEntity loginUser(CompanyLoginRequest companyLoginRequest);
}
