package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public record CompanyRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
