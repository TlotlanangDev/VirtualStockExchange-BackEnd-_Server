package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "CompanyAccount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyRegisterEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @NotBlank(message = "Please Enter Company Name.")
        @Size(min = 2, max = 50, message = "Company companyName must be between 2 & 50 characters.")
        private String companyName;
        @NotBlank(message = "Please Enter your Company Registration Number.")
        @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
        @Pattern(regexp = "^\\d{4}/\\d{6}/\\d{2}$",
                message = "Please Enter Correct Registration Number")
        private String registrationNumber;
        @NotNull(message = "Please Enter Company Registration Date.")
        @Past(message = "Enter Correct Registration Date.")
        private LocalDate registrationDate;
        @Pattern(regexp = "^(\\+27|0)[1-9]\\d{8}$",
                message = "Please Enter Correct Telephone Number")
        private String telePhone;
        @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
        @Email(message = "Please Enter valid Email Address.")
        @NotBlank(message = "Please Enter Email address.")
        private String emailAddress;
        @Size(min = 8, max = 40, message = "Passowrd should have at least 8 characters.")
        @NotBlank(message = "passWord cannot be Empty..")
        private String passWord;
        @Null
        private Integer stockShare;
        @Null
        private BigDecimal pricePerShare;

}
