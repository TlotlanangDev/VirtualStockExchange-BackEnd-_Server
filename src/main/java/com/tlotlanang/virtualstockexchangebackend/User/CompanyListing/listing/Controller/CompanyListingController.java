package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.domain.CompanyListingResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.entity.CompanyListingEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.mapper.CompanyListingMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.listing.service.CompanyListingService;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.mapper.CompanyRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.service.CompanyRegisterService;
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
