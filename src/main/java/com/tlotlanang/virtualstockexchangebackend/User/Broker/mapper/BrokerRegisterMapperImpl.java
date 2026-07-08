package com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerregisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerRegisterEntity;
import org.springframework.stereotype.Component;

@Component
public class BrokerRegisterMapperImpl implements BrokerRegisterMapper {
    @Override
    public BrokerRegisterRequest fromDto(BrokerRegisterDto brokerRegisterDto) {
        return new BrokerRegisterRequest(
                brokerRegisterDto.name(),
                brokerRegisterDto.surName(),
                brokerRegisterDto.dateOfBirth(),
                brokerRegisterDto.phoneNumber(),
                brokerRegisterDto.emailAddress(),
                brokerRegisterDto.passWord());
    }

    @Override
    public BrokerregisterResponseDto toDto(BrokerRegisterEntity brokerRegisterEntity) {
        return new BrokerregisterResponseDto(
                brokerRegisterEntity.getUuid(),
                brokerRegisterEntity.getName(),
                brokerRegisterEntity.getSurName(),
                brokerRegisterEntity.getDateOfBirth(),
                brokerRegisterEntity.getPhoneNumber(),
                brokerRegisterEntity.getEmailAddress()
                //brokerRegisterEntity.getPassWord()
        );
    }
}
