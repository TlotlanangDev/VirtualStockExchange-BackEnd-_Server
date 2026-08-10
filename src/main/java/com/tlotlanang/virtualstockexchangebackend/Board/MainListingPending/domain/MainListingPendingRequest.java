package com.tlotlanang.virtualstockexchangebackend.Board.MainListingPending.domain;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record MainListingPendingRequest(

        Integer Id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {}
