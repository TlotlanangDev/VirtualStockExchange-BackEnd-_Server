package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.domain.CompanyViewsBankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.domain.CompanyViewsBankersRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.domain.CompanyViewsBankersResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.banker.entity.CompanyViewsBankersEntity;

public interface CompanyViewsBankersMapper {

    CompanyViewsBankersRequest fromDto(CompanyViewsBankerDto companyViewsBankerDto);
    CompanyViewsBankersResponseDto toDto(CompanyViewsBankersEntity companyViewsBankersEntity);
}
