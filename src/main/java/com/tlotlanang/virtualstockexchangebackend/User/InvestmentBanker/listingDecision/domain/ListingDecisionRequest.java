package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain;

import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record ListingDecisionRequest(

        Integer id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {
}
