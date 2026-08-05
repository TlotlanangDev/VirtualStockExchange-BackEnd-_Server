package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.entity.CompanyViewsBankersEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface CompanyViewsBankersService {

    Slice<CompanyViewsBankersEntity> getBankersList(Pageable pageable);
    CompanyViewsBankersEntity viewByEmail(String emailAddress);
}
