package com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.entity.InvestorRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.registerInvestor.repository.InvestorRegisterRepository;
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
