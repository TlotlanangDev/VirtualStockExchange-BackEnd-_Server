package com.tlotlanang.virtualstockexchangebackend.User.Investor.domain;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record InvestorRegisterResponseDto(
        UUID Id,
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress
        //String passWord
) {
}
