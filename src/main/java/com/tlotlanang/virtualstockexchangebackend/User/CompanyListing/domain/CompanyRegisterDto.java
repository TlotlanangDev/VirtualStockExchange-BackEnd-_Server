package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;


import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record CompanyRegisterDto(
         
         Integer id,
         @NotBlank(message = "Please Enter Company Name.")
         @Size(min = 2, max = 50, message = "Company companyName must be between 2 & 50 characters.")
         String companyName,
         @NotBlank(message = "Please Enter your Company Registration Number.")
         @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
         @Pattern(regexp = "^\\d{4}\\/\\d{4,6}\\/\\d{2}$\n",
            message = "Please Enter Correct Registration Number")
         String registrationNumber,
         @NotNull(message = "Please Enter Company Registration Date.")
         @Past(message = "Enter Correct Registration Date.")
         LocalDate registrationDate,
         @Pattern(regexp = "^(\\+27|0)[1-9][0-9\\s\\-]{8,}$",
            message = "Please Enter Correct Telephone Number")
         String telePhone,
         @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
         @Email(message = "Please Enter valid Email Address.")
         @NotBlank(message = "Please Enter Email address.")
         String emailAddress,
         @Size(min = 8, max = 40, message = "Passowrd should have at least 8 characters.")
         @NotBlank(message = "passWord cannot be Empty..")
         String passWord) {}
