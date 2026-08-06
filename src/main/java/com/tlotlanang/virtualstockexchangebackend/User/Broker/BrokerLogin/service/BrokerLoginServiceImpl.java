package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler.exception.EmailPassException;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.repository.BrokerLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrokerLoginServiceImpl implements BrokerLoginService {

    @Autowired
    private BrokerLoginRepository brokerLoginRepository;

    @Override
    public BrokerLoginEntity loginUser(BrokerLoginRequest companyLoginRequest) {

        BrokerLoginEntity companyLoginEntity = new BrokerLoginEntity(
                         companyLoginRequest.emailAddress(),
                         companyLoginRequest.passWord());
        return brokerLoginRepository.
               findById(companyLoginEntity
                       .getEmailAddress()).map(brokerEntity ->
               {if(brokerEntity.getPassWord().equals(companyLoginEntity.getPassWord())){return brokerEntity;}
               throw new EmailPassException("PassWord and Email do not match.");})
               .orElseThrow(() -> new EmailPassException("Email not found"));
    }
}
