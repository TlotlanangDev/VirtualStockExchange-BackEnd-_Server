package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.exception.brokerEmailPassException;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.repository.BrokerLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrokerLoginServiceImpl implements BrokerLoginService{

    @Autowired
    private BrokerLoginRepository brokerLoginRepository;

    @Override
    public BrokerLoginEntity loginUser(BrokerLoginRequest brokerLoginRequest) {

        BrokerLoginEntity brokerLoginEntity = new BrokerLoginEntity(
                         brokerLoginRequest.emailAddress(),
                         brokerLoginRequest.passWord());
        return brokerLoginRepository.
                         findById(brokerLoginEntity
                        .getEmailAddress()).map(brokerEntity -> {
                            if(brokerEntity.getPassWord().equals(brokerLoginEntity.getPassWord())){
                                return brokerEntity;
                            }
                            throw new brokerEmailPassException("PassWord and Email do not match.");})

                        .orElseThrow(() -> new brokerEmailPassException("Email not found"));
    }
}
