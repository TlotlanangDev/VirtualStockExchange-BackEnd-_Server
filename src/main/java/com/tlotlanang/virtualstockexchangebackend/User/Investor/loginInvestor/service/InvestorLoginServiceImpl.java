package com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.entity.InvestorLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.loginInvestor.repository.InvestorLoginRepository;
import com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler.exception.EmailPassException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestorLoginServiceImpl implements InvestorLoginService {

    @Autowired
    private InvestorLoginRepository investorLoginRepository;

    @Override
    public InvestorLoginEntity loginUser(InvestorLoginRequest investorLoginRequest) {

        InvestorLoginEntity investorLoginEntity = new InvestorLoginEntity(
                investorLoginRequest.emailAddress(),
                investorLoginRequest.passWord());
        return investorLoginRepository.
               findById(investorLoginEntity
               .getEmailAddress()).map(investorEntity ->
               {if(investorEntity.getPassWord().equals(investorLoginEntity.getPassWord())){return investorEntity;}
               throw new EmailPassException("PassWord and Email do not match.");})
               .orElseThrow(() -> new EmailPassException("Email not found"));
    }
}
