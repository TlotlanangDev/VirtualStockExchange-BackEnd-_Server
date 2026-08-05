package com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain;

import lombok.Builder;

@Builder
public record InvestorLoginRequest(
        String emailAddress,
        String passWord
) {
}
