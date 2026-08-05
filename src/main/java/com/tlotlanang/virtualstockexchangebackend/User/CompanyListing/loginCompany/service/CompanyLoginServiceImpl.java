package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.entity.CompanyLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.repository.CompanyLoginRepository;
import com.tlotlanang.virtualstockexchangebackend.globalExceptionHandler.exception.EmailPassException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyLoginServiceImpl implements CompanyLoginService {

    @Autowired
    private CompanyLoginRepository companyLoginRepository;

    @Override
    public CompanyLoginEntity loginUser(CompanyLoginRequest companyLoginRequest) {

        CompanyLoginEntity companyLoginEntity = new CompanyLoginEntity(
                           companyLoginRequest.emailAddress(),
                           companyLoginRequest.passWord());
        return companyLoginRepository.
               findById(companyLoginEntity
               .getEmailAddress()).map(companyEntity ->
               {if(companyEntity.getPassWord().equals(companyLoginEntity.getPassWord())){return companyEntity;}
               throw new EmailPassException("PassWord and Email do not match.");})
               .orElseThrow(() -> new EmailPassException("Email not found"));
    }

}
