package com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;

public interface BrokerMapper {

    BrokerRequest fromDto(BrokerDto brokerDto);
    BrokerResponseDto toDto(BrokerEntity brokerEntity);

}
