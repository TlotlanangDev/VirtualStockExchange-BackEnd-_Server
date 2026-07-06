package com.tlotlanang.virtualstockexchangebackend.userRegister.domain;

import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder

public record UserRegisterRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
