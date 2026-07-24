package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain;

import jakarta.validation.constraints.*;
import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record TemporaryBoardDto(
        Integer id,
        @NotBlank(message = "Please Enter Company Name.")
        @Size(min = 2, max = 50, message = "Company companyName must be between 2 & 50 characters.")
        String companyName,
        @NotBlank(message = "Please Enter your Company Registration Number.")
        @Size(min = 2, max = 50, message = "surname must be between 2 & 50 characters.")
        @Pattern(regexp = "^\\d{4}/\\d{6}/\\d{2}$",
                message = "Please Enter Correct Registration Number")
        String registrationNumber,
        @NotNull(message = "Stock Share cannot be null")
        @Positive(message = "Shares must be greater that zero.")
        @Digits(message = "Share must be digits.", integer = 10000, fraction = 0)
        Integer stockShare,
        @NotNull(message = "Stock Price cannot be null")
        @Positive(message = "Price must be greater that zero.")
        @Digits(message = "", integer = 1000, fraction = 2)
        BigDecimal pricePerShare
) {
}
