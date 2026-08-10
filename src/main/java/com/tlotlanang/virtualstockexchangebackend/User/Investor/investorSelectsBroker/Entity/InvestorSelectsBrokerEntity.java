package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BrokerAccount")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InvestorSelectsBrokerEntity {

    @NotBlank(message = "Broker Name cannot be null.")
    @Size(min = 2, max = 50, message = "name must be between 2 & 50 characters.")
    private String name;
    @NotBlank(message = "Broker surName cannot be null.")
    @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
    private String surName;
    @Pattern(regexp = "^(\\+27|0)[1-9][0-9\\s\\-]{8,}$",
            message = "Please Enter Correct Phone Number")
    private String phoneNumber;
    @Size(min = 5, max = 50, message = "Email Address must be between 5 & 50 characters.")
    @Email(message = "Broker Email Address not valid.")
    @NotBlank(message = "Broker Email address cannot be null.")
    private String emailAddress;
}
