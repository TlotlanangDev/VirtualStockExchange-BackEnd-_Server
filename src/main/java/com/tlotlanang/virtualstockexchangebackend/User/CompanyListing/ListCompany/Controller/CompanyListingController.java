package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.domain.CompanyListingResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.entity.CompanyListingEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.mapper.CompanyListingMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.service.CompanyListingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

public class CompanyListingController {

    @Autowired
    public CompanyListingService companyListingService;

    @Autowired
    public CompanyListingMapper companyListingMapper;

    @PostMapping("api/v1/stockExchange/company/listing")
    public ResponseEntity<CompanyListingResponseDto> listCompany(@Valid @RequestBody CompanyListingDto companyListingDto) {
        CompanyListingRequest companyListingRequest = companyListingMapper.fromDto(companyListingDto);
        CompanyListingEntity companyListingEntity = companyListingService.listCompany(companyListingRequest);
        CompanyListingResponseDto companyListingResponseDto = companyListingMapper.toDto(companyListingEntity);

        return new ResponseEntity<>(companyListingResponseDto, HttpStatus.CREATED);
    }
}
