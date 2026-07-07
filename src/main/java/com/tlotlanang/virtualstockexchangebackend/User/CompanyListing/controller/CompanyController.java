package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper.CompanyMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service.CompanyService;
import com.tlotlanang.virtualstockexchangebackend.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/company")
public class CompanyController implements User<CompanyResponseDto, CompanyDto> {
    @Autowired
    public CompanyService companyService;

    @Autowired
    public CompanyMapper companyMapper;


    @Override
    public ResponseEntity<CompanyResponseDto> registerUser(CompanyDto companyDto) {
        CompanyRequest companyRequest = companyMapper.fromDto(companyDto);
        CompanyEntity companyEntity = companyService.createUser(companyRequest);
        CompanyResponseDto companyResponseDto = companyMapper.toDto(companyEntity);

        return new ResponseEntity<>(companyResponseDto, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<CompanyResponseDto> loginUser() {
        return null;
    }




}
