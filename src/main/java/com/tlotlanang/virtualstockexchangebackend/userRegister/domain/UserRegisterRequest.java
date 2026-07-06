package com.tlotlanang.virtualstockexchangebackend.userRegister.domain;

import lombok.NoArgsConstructor;

import java.time.LocalDate;

public record UserRegisterRequest(
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
