package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImplement implements CompanyService {

    @Autowired
    private CompanyRepository userregisterrepository;


    @Override
    public CompanyEntity createUser(CompanyRequest companyRequest) {

        CompanyEntity companyEntity = new CompanyEntity(
                null,
                companyRequest.name(),
                companyRequest.surName(),
                companyRequest.dateOfBirth(),
                companyRequest.phoneNumber(),
                companyRequest.emailAddress(),
                companyRequest.passWord()
        );
        return userregisterrepository.save(companyEntity);
    }

}
