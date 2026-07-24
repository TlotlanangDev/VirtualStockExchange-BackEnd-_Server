package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder

public record CompanyRegisterRequest(
        Integer id,
        String companyName,
        String registrationNumber,
        LocalDate registrationDate,
        String telePhone,
        String emailAddress,
        String passWord,
        Integer stockShare,
        BigDecimal pricePerShare) {}
