package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;

public interface BrokerLoginService {

    BrokerLoginEntity loginUser(BrokerLoginRequest companyLoginRequest);
}
