package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.entity.BrokerRegisterEntity;

public interface BrokerRegisterService {

    BrokerRegisterEntity createUser(BrokerRegisterRequest brokerRegisterRequest);
}
