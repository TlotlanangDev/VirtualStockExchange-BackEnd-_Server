package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.entity.BrokerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.repository.BrokerRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BrokerRegisterServiceImpl implements BrokerRegisterService {

    @Autowired
    private BrokerRegisterRepository brokerregisterrepository;


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


        return brokerregisterrepository.save(brokerRegisterEntity);
    }

}
