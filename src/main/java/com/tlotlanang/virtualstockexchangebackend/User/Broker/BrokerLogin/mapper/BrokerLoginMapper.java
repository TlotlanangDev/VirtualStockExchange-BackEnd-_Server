package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;



public interface BrokerLoginMapper {
    BrokerLoginRequest fromDto(BrokerLoginDto brokerLoginDto);
    BrokerLoginResponseDto toDto(BrokerLoginEntity brokerLoginEntity);
}
