package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record CompanyLoginDto(

        @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
        @Email(message = "Please Enter valid Email Address.")
        @NotBlank(message = "Please Enter Email address.")
        String emailAddress,
        @Size(min = 8, max = 40, message = "Passowrd should have at least 8 characters.")
        @NotBlank(message = "passWord cannot be Empty..")
        String passWord
) {}
