package com.tlotlanang.virtualstockexchangebackend.User.Investor.investorSelectsBroker.domain;

import lombok.Builder;

@Builder
public record InvestorSelectsBrokerRequest(
        String name,
        String surName,
        String phoneNumber,
        String emailAddress
) {
}
