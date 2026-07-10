package com.tlotlanang.virtualstockexchangebackend.User.Investor.domain;

import lombok.Builder;

@Builder
public record InvestorLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
