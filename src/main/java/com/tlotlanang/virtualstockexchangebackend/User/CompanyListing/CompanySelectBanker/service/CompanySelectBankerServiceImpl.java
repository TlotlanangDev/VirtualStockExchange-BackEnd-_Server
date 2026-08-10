package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanySelectBankerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.repository.CompanySelectBankerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CompanySelectBankerServiceImpl implements CompanySelectBankerService {

    @Autowired
    private CompanySelectBankerRepository companySelectBankerRepository;

    @Override
    public Slice<CompanySelectBankerEntity> getBankersList(Pageable pageable) {

        return companySelectBankerRepository.findAll(pageable);
    }

    @Override
    public CompanySelectBankerEntity viewByEmail(String emailAddress) {
        return companySelectBankerRepository.findById(emailAddress).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Banker not found with Email Address: " + emailAddress));
    }
}
