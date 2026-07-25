package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.entity.CompanyViewsBankersEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface CompanyViewsBankersService {

    Slice<CompanyViewsBankersEntity> getBankersList(Pageable pageable);
}
