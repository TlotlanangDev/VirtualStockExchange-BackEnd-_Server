package com.tlotlanang.virtualstockexchangebackend.Board.TemporaryBoard.domain;


import lombok.Builder;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
public record TemporaryBoardResponseDto(

        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {}
