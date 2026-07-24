package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;


@Entity
@Table(name = "TemporaryListingAcc")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TemporaryBoardEntity {

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
    @NotNull(message = "Stock Share cannot be null")
    @Positive(message = "Shares must be greater that zero.")
    @Digits(message = "Share must be digits.", integer = 10000, fraction = 0)
    private Integer stockShare;
    @NotNull(message = "Stock Price cannot be null")
    @Positive(message = "Price must be greater that zero.")
    @Digits(message = "", integer = 1000, fraction = 2)
    private BigDecimal pricePerShare;
}
