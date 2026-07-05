package com.tlotlanang.virtualstockexchangebackend.userRegister;

import java.time.LocalDate;
import java.util.UUID;

public record UserDto(
        UUID Id,
        String name,
        String surName,
        LocalDate dateOfBirth,
        String phoneNumber,
        String emailAddress,
        String passWord
) {
}
