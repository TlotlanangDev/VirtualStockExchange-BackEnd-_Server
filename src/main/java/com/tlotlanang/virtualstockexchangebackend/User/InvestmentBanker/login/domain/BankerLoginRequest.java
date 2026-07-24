package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain;

import lombok.Builder;

@Builder
public record BankerLoginRequest(
        String emailAddress,
        String passWord
) {
}
