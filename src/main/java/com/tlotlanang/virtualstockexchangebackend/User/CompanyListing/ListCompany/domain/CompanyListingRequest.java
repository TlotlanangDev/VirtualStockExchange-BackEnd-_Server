package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain;

import java.math.BigDecimal;

public record CompanyListingRequest(
        Integer id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
)
{}

