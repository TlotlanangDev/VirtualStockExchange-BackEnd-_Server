package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.domain;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record MainBoardRequest(

        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {}
