package com.tlotlanang.virtualstockexchangebackend.User.Investor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.repository.InvestorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class InvestorServiceImplement implements InvestorService {

    @Autowired
    private InvestorRepository userregisterrepository;


    @Override
    public InvestorEntity createUser(InvestorRequest investorRequest) {

        InvestorEntity investorEntity = new InvestorEntity(
                null,
                investorRequest.name(),
                investorRequest.surName(),
                investorRequest.dateOfBirth(),
                investorRequest.phoneNumber(),
                investorRequest.emailAddress(),
                investorRequest.passWord()
        );
        return userregisterrepository.save(investorEntity);
    }

}
