package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanySelectBankerDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanySelectBankerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.domain.CompanySelectBankerResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.CompanySelectBanker.entity.CompanySelectBankerEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanySelectBankerMapperImpl implements CompanySelectBankerMapper {
    @Override
    public CompanySelectBankerRequest fromDto(CompanySelectBankerDto companySelectBankerDto) {
        return new CompanySelectBankerRequest(
                companySelectBankerDto.name(),
                companySelectBankerDto.surName(),
                companySelectBankerDto.phoneNumber(),
                companySelectBankerDto.emailAddress());
    }

    @Override
    public CompanySelectBankerResponseDto toDto(CompanySelectBankerEntity companySelectBankerEntity) {
        return new CompanySelectBankerResponseDto(
                companySelectBankerEntity.getName(),
                companySelectBankerEntity.getSurName(),
                companySelectBankerEntity.getPhoneNumber(),
                companySelectBankerEntity.getEmailAddress());
    }
}
