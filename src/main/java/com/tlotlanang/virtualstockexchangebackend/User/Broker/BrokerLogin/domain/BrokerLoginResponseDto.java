package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain;

import lombok.Builder;

@Builder
public record BrokerLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
