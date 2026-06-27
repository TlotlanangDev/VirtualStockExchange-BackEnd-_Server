package com.tlotlanang.virtualstockexchangebackend.userRegister;


import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;
public record UsersDto(
         UUID Id,
         @NotBlank(message = "Name cannot be Empty..")
         String name,
         @NotBlank(message = "surName cannot be Empty..")
         String surName,
         @Past
         LocalDate dateOfBirth,
         @Min(10)
         @Max(10)
         @Positive
         Integer phoneNumber,
         @NotBlank(message = "email Address cannot be Empty..")
         String emailAddress,
         @NotBlank(message = "passWord cannot be Empty..")
         String passWord,
         @NotBlank(message = "physical Address cannot be Empty..")
         String physicalAddress) {}
