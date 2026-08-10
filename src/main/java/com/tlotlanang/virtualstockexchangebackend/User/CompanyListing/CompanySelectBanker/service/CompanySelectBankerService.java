package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanySelectBankerEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface CompanySelectBankerService {

    Slice<CompanySelectBankerEntity> getBankersList(Pageable pageable);
    CompanySelectBankerEntity viewByEmail(String emailAddress);
}
