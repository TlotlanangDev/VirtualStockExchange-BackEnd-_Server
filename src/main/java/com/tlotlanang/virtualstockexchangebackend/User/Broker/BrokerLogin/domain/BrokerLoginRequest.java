package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain;

import lombok.Builder;

@Builder
public record BrokerLoginRequest(
        String emailAddress,
        String passWord
) {
}
