package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.domain.CompanyViewsBankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.domain.CompanyViewsBankersRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.domain.CompanyViewsBankersResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectbanker.entity.CompanyViewsBankersEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyViewsBankersMapperImpl implements CompanyViewsBankersMapper{
    @Override
    public CompanyViewsBankersRequest fromDto(CompanyViewsBankerDto companyViewsBankerDto) {
        return new CompanyViewsBankersRequest(
                companyViewsBankerDto.name(),
                companyViewsBankerDto.surName(),
                companyViewsBankerDto.phoneNumber(),
                companyViewsBankerDto.emailAddress());
    }

    @Override
    public CompanyViewsBankersResponseDto toDto(CompanyViewsBankersEntity companyViewsBankersEntity) {
        return new CompanyViewsBankersResponseDto(
                companyViewsBankersEntity.getName(),
                companyViewsBankersEntity.getSurName(),
                companyViewsBankersEntity.getPhoneNumber(),
                companyViewsBankersEntity.getEmailAddress());
    }
}
