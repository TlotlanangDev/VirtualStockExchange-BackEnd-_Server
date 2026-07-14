package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record CompanyRegisterResponseDto(
        Integer Id,
        String companyName,
        String registrationNumber,
        LocalDate registrationDate,
        String telePhone,
        String emailAddress
        //String passWord
) {
}
