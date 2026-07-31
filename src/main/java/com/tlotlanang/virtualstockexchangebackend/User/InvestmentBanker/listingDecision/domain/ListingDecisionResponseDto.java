package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain;

import java.math.BigDecimal;

public record ListingDecisionResponseDto(

        Integer id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {
}
