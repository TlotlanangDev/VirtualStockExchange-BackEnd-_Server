package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.repository.CompanyRegisterRepository;
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
                companyRegisterRequest.name(),
                companyRegisterRequest.surName(),
                companyRegisterRequest.dateOfBirth(),
                companyRegisterRequest.phoneNumber(),
                companyRegisterRequest.emailAddress(),
                companyRegisterRequest.passWord()
        );
        return userregisterrepository.save(companyRegisterEntity);
    }

}
