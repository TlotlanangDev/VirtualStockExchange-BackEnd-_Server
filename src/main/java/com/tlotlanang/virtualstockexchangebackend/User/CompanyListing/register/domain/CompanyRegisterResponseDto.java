package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record CompanyRegisterResponseDto(
        Integer Id,
        String companyName,
        String registrationNumber,
        LocalDate registrationDate,
        String telePhone,
        String emailAddress,
        Integer stockShare,
        BigDecimal pricePerShare
        //String passWord
) {
}
