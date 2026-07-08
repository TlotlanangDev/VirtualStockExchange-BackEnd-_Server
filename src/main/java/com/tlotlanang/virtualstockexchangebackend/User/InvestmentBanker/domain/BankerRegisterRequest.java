package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public record BankerRegisterRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
