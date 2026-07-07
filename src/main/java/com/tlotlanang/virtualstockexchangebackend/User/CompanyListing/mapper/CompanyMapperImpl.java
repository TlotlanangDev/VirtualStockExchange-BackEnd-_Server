package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyMapperImpl implements CompanyMapper {
    @Override
    public CompanyRequest fromDto(CompanyDto companyDto) {
        return new CompanyRequest(
                companyDto.name(),
                companyDto.surName(),
                companyDto.dateOfBirth(),
                companyDto.phoneNumber(),
                companyDto.emailAddress(),
                companyDto.passWord());
    }

    @Override
    public CompanyResponseDto toDto(CompanyEntity companyEntity) {
        return new CompanyResponseDto(
                companyEntity.getUuid(),
                companyEntity.getName(),
                companyEntity.getSurName(),
                companyEntity.getDateOfBirth(),
                companyEntity.getPhoneNumber(),
                companyEntity.getEmailAddress()
                //companyEntity.getPassWord()
        );
    }
}
