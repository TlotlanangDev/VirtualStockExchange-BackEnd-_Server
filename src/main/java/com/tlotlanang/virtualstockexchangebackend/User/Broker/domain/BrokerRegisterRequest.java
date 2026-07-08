package com.tlotlanang.virtualstockexchangebackend.User.Broker.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder

public record BrokerRegisterRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
