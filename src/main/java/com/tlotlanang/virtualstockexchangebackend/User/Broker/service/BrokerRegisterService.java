package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerRegisterEntity;

public interface BrokerRegisterService {

    BrokerRegisterEntity createUser(BrokerRegisterRequest brokerRegisterRequest);
}
