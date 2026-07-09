package com.tlotlanang.virtualstockexchangebackend.User.Broker.domain;

import lombok.Builder;

@Builder
public record BrokerLoginRequest(
        String emailAddress,
        String passWord
) {
}
