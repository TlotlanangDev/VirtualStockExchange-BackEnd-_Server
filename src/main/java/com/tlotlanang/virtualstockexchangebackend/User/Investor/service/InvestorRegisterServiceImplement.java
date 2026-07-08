package com.tlotlanang.virtualstockexchangebackend.User.Investor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.repository.InvestorRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvestorRegisterServiceImplement implements InvestorRegisterService {

    @Autowired
    private InvestorRegisterRepository userregisterrepository;


    @Override
    public InvestorRegisterEntity createUser(InvestorRegisterRequest investorRegisterRequest) {

        InvestorRegisterEntity investorRegisterEntity = new InvestorRegisterEntity(
                null,
                investorRegisterRequest.name(),
                investorRegisterRequest.surName(),
                investorRegisterRequest.dateOfBirth(),
                investorRegisterRequest.phoneNumber(),
                investorRegisterRequest.emailAddress(),
                investorRegisterRequest.passWord()
        );
        return userregisterrepository.save(investorRegisterEntity);
    }

}
