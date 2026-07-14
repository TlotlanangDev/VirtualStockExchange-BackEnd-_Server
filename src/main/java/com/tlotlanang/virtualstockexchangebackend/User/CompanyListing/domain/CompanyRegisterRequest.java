package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public record CompanyRegisterRequest(
        Integer id,
        String companyName,
        String registrationNumber,
        LocalDate registrationDate,
        String telePhone,
        String emailAddress,
        String passWord
) {
}
