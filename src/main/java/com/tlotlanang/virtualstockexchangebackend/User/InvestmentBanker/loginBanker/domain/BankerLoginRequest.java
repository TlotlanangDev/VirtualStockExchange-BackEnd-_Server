package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain;

import lombok.Builder;

@Builder
public record BankerLoginRequest(
        String emailAddress,
        String passWord
) {
}
