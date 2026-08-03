package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ListingDecisionResponseDto(

        Integer id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {
}
