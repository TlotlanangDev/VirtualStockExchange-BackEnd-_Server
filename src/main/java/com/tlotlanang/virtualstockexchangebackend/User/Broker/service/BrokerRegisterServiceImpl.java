package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.repository.BrokerRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrokerRegisterServiceImpl implements BrokerRegisterService {

    @Autowired
    private BrokerRegisterRepository userregisterrepository;


    @Override
    public BrokerRegisterEntity createUser(BrokerRegisterRequest brokerRegisterRequest) {

        BrokerRegisterEntity brokerRegisterEntity = new BrokerRegisterEntity(
                null,
                brokerRegisterRequest.name(),
                brokerRegisterRequest.surName(),
                brokerRegisterRequest.dateOfBirth(),
                brokerRegisterRequest.phoneNumber(),
                brokerRegisterRequest.emailAddress(),
                brokerRegisterRequest.passWord()
        );
        return userregisterrepository.save(brokerRegisterEntity);
    }

}
