package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public record InvestorRegisterRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
