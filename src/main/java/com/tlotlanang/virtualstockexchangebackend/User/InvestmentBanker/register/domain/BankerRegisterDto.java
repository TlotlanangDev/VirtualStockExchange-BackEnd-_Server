package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.domain;


import jakarta.validation.constraints.*;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record BankerRegisterDto(

         @NotBlank(message = "Please Enter your Name.")
         @Size(min = 2, max = 50, message = "name must be between 2 & 50 characters.")
         String name,
         @NotBlank(message = "Please Enter your surName.")
         @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
         String surName,
         @NotNull(message = "Please Enter Date of Birth.")
         @Past(message = "Enter Correct Date of Birth.")
         LocalDate dateOfBirth,
         @Pattern(regexp = "^(\\+27|0)[1-9][0-9\\s\\-]{8,}$",
                 message = "Please Enter Correct Phone Number")
         String phoneNumber,
         @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
         @Email(message = "Please Enter valid Email Address.")
         @NotBlank(message = "Please Enter Email address.")
         String emailAddress,
         @Size(min = 8, max = 40, message = "Passowrd should have at least 8 characters.")
         @NotBlank(message = "passWord cannot be Empty..")
         String passWord) {}
