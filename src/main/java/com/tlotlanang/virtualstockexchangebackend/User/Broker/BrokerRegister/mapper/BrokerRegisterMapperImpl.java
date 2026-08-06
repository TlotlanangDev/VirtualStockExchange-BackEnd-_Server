package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.entity.BrokerRegisterEntity;
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
    public BrokerRegisterResponseDto toDto(BrokerRegisterEntity brokerRegisterEntity) {
        return new BrokerRegisterResponseDto(
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
