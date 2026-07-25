package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.entity.CompanyViewsBankersEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.repository.CompanyViewsBankersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class CompanyViewsBankersServiceImpl implements CompanyViewsBankersService{

    @Autowired
    private CompanyViewsBankersRepository companyViewsBankersRepository;

    @Override
    public Slice<CompanyViewsBankersEntity> getBankersList(Pageable pageable) {

        return companyViewsBankersRepository.findAll(pageable);
    }
}
