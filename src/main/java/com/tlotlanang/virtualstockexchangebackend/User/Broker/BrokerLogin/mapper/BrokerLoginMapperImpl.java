package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;
import org.springframework.stereotype.Component;

@Component
public class BrokerLoginMapperImpl implements BrokerLoginMapper {
    @Override
    public BrokerLoginRequest fromDto(BrokerLoginDto brokerLoginDto) {
        return new BrokerLoginRequest(
                brokerLoginDto.emailAddress(),
                brokerLoginDto.passWord()
        );
    }

    @Override
    public BrokerLoginResponseDto toDto(BrokerLoginEntity brokerLoginEntity) {
        return new BrokerLoginResponseDto(
                brokerLoginEntity.getEmailAddress(),
                brokerLoginEntity.getPassWord()
        );
    }
}
