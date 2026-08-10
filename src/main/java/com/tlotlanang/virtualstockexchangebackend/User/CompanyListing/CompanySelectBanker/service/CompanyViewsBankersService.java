package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanyViewsBankersEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface CompanyViewsBankersService {

    Slice<CompanyViewsBankersEntity> getBankersList(Pageable pageable);
    CompanyViewsBankersEntity viewByEmail(String emailAddress);
}
