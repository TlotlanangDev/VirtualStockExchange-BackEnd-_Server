package com.tlotlanang.virtualstockexchangebackend.User.Investor.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "InvestorAccount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvestorRegisterEntity {
        @Id
        @GeneratedValue
        @UuidGenerator
        private UUID uuid;
        @NotBlank(message = "Please Enter your Name.")
        @Size(min = 2, max = 50, message = "name must be between 2 & 50 characters.")
        private String name;
        @NotBlank(message = "Please Enter your surName.")
        @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
        private String surName;
        @NotNull(message = "Please Enter Date of Birth.")
        @Past(message = "Enter Correct Date of Birth.")
        private LocalDate dateOfBirth;
        @Pattern(regexp = "^(\\+27|0)[1-9][0-9\\s\\-]{8,}$",
                message = "Please Enter Correct Phone Number")
        private String phoneNumber;
        @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
        @Email(message = "Please Enter valid Email Address.")
        @NotBlank(message = "Please Enter Email address.")
        private String emailAddress;
        @Size(min = 8, max = 40, message = "Passowrd should have at least 8 characters.")
        @NotBlank(message = "passWord cannot be Empty..")
        private String passWord;

}
