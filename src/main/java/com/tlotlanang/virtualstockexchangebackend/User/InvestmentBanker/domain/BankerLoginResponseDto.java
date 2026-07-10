package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain;

import lombok.Builder;

@Builder
public record BankerLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
