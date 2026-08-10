package com.tlotlanang.virtualstockexchangebackend.Board.MainListingBoard.MainListingApproved.domain;


import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record MainBoardResponseDto(

        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {}
