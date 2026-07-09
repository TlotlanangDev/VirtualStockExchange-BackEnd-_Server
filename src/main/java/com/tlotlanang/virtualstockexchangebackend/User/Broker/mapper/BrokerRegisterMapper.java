package com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerRegisterEntity;

public interface BrokerRegisterMapper {

    BrokerRegisterRequest fromDto(BrokerRegisterDto brokerRegisterDto);
    BrokerRegisterResponseDto toDto(BrokerRegisterEntity brokerRegisterEntity);

}
