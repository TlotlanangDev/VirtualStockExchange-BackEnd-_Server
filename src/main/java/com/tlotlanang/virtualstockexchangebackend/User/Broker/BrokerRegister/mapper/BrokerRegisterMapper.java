package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.entity.BrokerRegisterEntity;

public interface BrokerRegisterMapper {

    BrokerRegisterRequest fromDto(BrokerRegisterDto brokerRegisterDto);
    BrokerRegisterResponseDto toDto(BrokerRegisterEntity brokerRegisterEntity);

}
