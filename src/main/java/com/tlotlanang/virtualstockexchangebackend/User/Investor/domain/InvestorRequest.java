package com.tlotlanang.virtualstockexchangebackend.User.Investor.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public record InvestorRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
