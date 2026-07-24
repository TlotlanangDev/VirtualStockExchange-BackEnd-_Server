package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CompanyListingResponseDto (
        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
){
}
