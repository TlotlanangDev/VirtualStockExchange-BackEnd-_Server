package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.mapper;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;
import org.springframework.stereotype.Component;

@Component
public class CompanyRegisterMapperImpl implements CompanyRegisterMapper {
    @Override
    public CompanyRegisterRequest fromDto(CompanyRegisterDto companyRegisterDto) {
        return new CompanyRegisterRequest(
                companyRegisterDto.id(),
                companyRegisterDto.companyName(),
                companyRegisterDto.registrationNumber(),
                companyRegisterDto.registrationDate(),
                companyRegisterDto.telePhone(),
                companyRegisterDto.emailAddress(),
                companyRegisterDto.passWord(),
                companyRegisterDto.stockShare(),
                companyRegisterDto.pricePerShare());
    }

    @Override
    public CompanyRegisterResponseDto toDto(CompanyRegisterEntity companyRegisterEntity) {
        return new CompanyRegisterResponseDto(
                companyRegisterEntity.getId(),
                companyRegisterEntity.getCompanyName(),
                companyRegisterEntity.getRegistrationNumber(),
                companyRegisterEntity.getRegistrationDate(),
                companyRegisterEntity.getTelePhone(),
                companyRegisterEntity.getEmailAddress(),
                companyRegisterEntity.getStockShare(),
                companyRegisterEntity.getPricePerShare()

        );
    }
}
