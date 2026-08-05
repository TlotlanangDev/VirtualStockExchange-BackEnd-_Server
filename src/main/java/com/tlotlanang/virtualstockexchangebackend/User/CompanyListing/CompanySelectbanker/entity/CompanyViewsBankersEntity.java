package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BankerAccount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyViewsBankersEntity{

    @NotBlank(message = "Please Enter your Name.")
    @Size(min = 2, max = 50, message = "name must be between 2 & 50 characters.")
    private String name;
    @NotBlank(message = "Please Enter your surName.")
    @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
    private String surName;
    @Pattern(regexp = "^(\\+27|0)[1-9][0-9\\s\\-]{8,}$",
            message = "Please Enter Correct Phone Number")
    private String phoneNumber;
    @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
    @Email(message = "Please Enter valid Email Address.")
    @NotBlank(message = "Please Enter Email address.")
    @Id
    private String emailAddress;

}
