package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record BankerRegisterResponseDto(
        UUID Id,
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress
        //String passWord
) {
}
