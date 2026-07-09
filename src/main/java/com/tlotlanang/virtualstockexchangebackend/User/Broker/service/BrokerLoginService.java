package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerLoginEntity;

public interface BrokerLoginService {

    BrokerLoginEntity loginUser(BrokerLoginRequest brokerLoginRequest);
}
