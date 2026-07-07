package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.repository.BrokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrokerServiceImplement implements BrokerService {

    @Autowired
    private BrokerRepository userregisterrepository;


    @Override
    public BrokerEntity createUser(BrokerRequest brokerRequest) {

        BrokerEntity brokerEntity = new BrokerEntity(
                null,
                brokerRequest.name(),
                brokerRequest.surName(),
                brokerRequest.dateOfBirth(),
                brokerRequest.phoneNumber(),
                brokerRequest.emailAddress(),
                brokerRequest.passWord()
        );
        return userregisterrepository.save(brokerEntity);
    }

}
