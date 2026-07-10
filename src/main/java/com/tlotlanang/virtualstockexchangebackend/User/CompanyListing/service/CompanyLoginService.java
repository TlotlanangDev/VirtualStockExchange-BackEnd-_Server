package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyLoginEntity;

public interface CompanyLoginService {

    CompanyLoginEntity loginUser(CompanyLoginRequest companyLoginRequest);
}
