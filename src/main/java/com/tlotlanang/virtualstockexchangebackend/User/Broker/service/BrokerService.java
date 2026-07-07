package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;

public interface BrokerService {

    BrokerEntity createUser(BrokerRequest brokerRequest);
}
