package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CompanyAccount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompanyLoginEntity {


    @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
    @Email(message = "Please Enter valid Email Address.")
    @NotBlank(message = "Please Enter Email address.")
    @Id
    private String emailAddress;
    @Size(min = 8, max = 40, message = "Passowrd should have at least 8 characters.")
    @NotBlank(message = "passWord cannot be Empty..")
    private String passWord;
}
