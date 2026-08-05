package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain;

import java.math.BigDecimal;

public record CompanyListingResponseDto (
        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
){
}
