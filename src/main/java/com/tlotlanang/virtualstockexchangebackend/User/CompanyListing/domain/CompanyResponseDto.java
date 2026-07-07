package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record CompanyResponseDto(
        UUID Id,
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress
        //String passWord
) {
}
