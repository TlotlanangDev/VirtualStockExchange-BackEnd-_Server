package com.tlotlanang.virtualstockexchangebackend.User.Broker.domain;

import lombok.Builder;

@Builder
public record BrokerLoginResponseDto(
        String emailAddress,
        String passWord
) {
}
