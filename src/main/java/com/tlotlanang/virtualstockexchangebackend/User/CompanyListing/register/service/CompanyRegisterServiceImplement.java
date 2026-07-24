package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.repository.CompanyRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyRegisterServiceImplement implements CompanyRegisterService {

    @Autowired
    private CompanyRegisterRepository userregisterrepository;


    @Override
    public CompanyRegisterEntity createUser(CompanyRegisterRequest companyRegisterRequest) {

        CompanyRegisterEntity companyRegisterEntity = new CompanyRegisterEntity(
                companyRegisterRequest.id(),
                companyRegisterRequest.companyName(),
                companyRegisterRequest.registrationNumber(),
                companyRegisterRequest.registrationDate(),
                companyRegisterRequest.telePhone(),
                companyRegisterRequest.emailAddress(),
                companyRegisterRequest.passWord(),
                companyRegisterRequest.stockShare(),
                companyRegisterRequest.pricePerShare()
        );
        return userregisterrepository.save(companyRegisterEntity);
    }

}
