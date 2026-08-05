package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.domain;

import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record CompanyViewsBankerDto (
        @NotBlank(message = "Please Enter your Name.")
        @Size(min = 2, max = 50, message = "name must be between 2 & 50 characters.")
        String name,
        @NotBlank(message = "Please Enter your surName.")
        @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
        String surName,
        @Pattern(regexp = "^(\\+27|0)[1-9][0-9\\s\\-]{8,}$",
        message = "Please Enter Correct Phone Number")
        String phoneNumber,
        @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
        @Email(message = "Please Enter valid Email Address.")
        @NotBlank(message = "Please Enter Email address.")
        @Id
        String emailAddress
){}
