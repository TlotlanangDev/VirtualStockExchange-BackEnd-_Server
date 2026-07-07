package com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;
import org.springframework.stereotype.Component;

@Component
public class BrokerMapperImpl implements BrokerMapper {
    @Override
    public BrokerRequest fromDto(BrokerDto brokerDto) {
        return new BrokerRequest(
                brokerDto.name(),
                brokerDto.surName(),
                brokerDto.dateOfBirth(),
                brokerDto.phoneNumber(),
                brokerDto.emailAddress(),
                brokerDto.passWord());
    }

    @Override
    public BrokerResponseDto toDto(BrokerEntity brokerEntity) {
        return new BrokerResponseDto(
                brokerEntity.getUuid(),
                brokerEntity.getName(),
                brokerEntity.getSurName(),
                brokerEntity.getDateOfBirth(),
                brokerEntity.getPhoneNumber(),
                brokerEntity.getEmailAddress()
                //brokerEntity.getPassWord()
        );
    }
}
