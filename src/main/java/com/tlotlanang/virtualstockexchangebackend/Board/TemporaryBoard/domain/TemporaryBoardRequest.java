package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain;

import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record TemporaryBoardRequest(

        Integer Id,
        String companyName,
        String registrationNumber,
        LocalDate registrationDate,
        String telePhone,
        String emailAddress,
        Integer stockShare,
        BigDecimal pricePerShare
) {}
