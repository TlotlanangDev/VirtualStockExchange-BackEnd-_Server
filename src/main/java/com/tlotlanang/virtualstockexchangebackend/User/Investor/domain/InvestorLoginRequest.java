package com.tlotlanang.virtualstockexchangebackend.User.Investor.domain;

import lombok.Builder;

@Builder
public record InvestorLoginRequest(
        String emailAddress,
        String passWord
) {
}
