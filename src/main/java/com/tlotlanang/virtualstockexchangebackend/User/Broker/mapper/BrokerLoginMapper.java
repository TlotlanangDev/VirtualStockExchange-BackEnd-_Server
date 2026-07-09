package com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.*;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerLoginEntity;


public interface BrokerLoginMapper {
    BrokerLoginRequest fromDto(BrokerLoginDto brokerLoginDto);
    BrokerLoginResponseDto toDto(BrokerLoginEntity brokerLoginEntity);
}
