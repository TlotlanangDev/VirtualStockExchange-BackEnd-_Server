package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.listingDecision.domain;

import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public record ListingDecisionRequest(

        Integer id,
        String companyName,
        String registrationNumber,
        Integer stockShare,
        BigDecimal pricePerShare
) {
}
