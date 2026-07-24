package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain;

import lombok.Builder;

@Builder
public record BankerLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
