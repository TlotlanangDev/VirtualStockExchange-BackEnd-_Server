package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanyViewsBankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanyViewsBankersRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanyViewsBankersResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanyViewsBankersEntity;
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
