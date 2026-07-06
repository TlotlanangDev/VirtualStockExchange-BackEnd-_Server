package com.tlotlanang.virtualstockexchangebackend.userRegister.domain;

import lombok.Builder;

import java.time.LocalDate;
import java.util.UUID;

@Builder
public record UserRegisterResponseDto(
        UUID Id,
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress
        //String passWord
) {
}
