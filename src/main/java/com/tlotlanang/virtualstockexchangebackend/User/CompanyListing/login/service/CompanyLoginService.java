package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.entity.CompanyLoginEntity;

public interface CompanyLoginService {

    CompanyLoginEntity loginUser(CompanyLoginRequest companyLoginRequest);
}
