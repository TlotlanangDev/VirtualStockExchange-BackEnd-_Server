package com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain;

import lombok.Builder;

@Builder
public record InvestorLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
