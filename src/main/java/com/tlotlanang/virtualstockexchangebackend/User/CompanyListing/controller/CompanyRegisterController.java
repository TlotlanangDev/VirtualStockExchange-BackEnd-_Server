package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper.CompanyRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service.CompanyRegisterService;

import com.tlotlanang.virtualstockexchangebackend.User.RegisterUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/company")
public class CompanyRegisterController implements RegisterUser<CompanyRegisterResponseDto, CompanyRegisterDto> {
    @Autowired
    public CompanyRegisterService companyRegisterService;

    @Autowired
    public CompanyRegisterMapper companyRegisterMapper;

    @Override
    public ResponseEntity<CompanyRegisterResponseDto> registerUser(@Valid @RequestBody CompanyRegisterDto companyRegisterDto) {
        CompanyRegisterRequest investorRequest = companyRegisterMapper.fromDto(companyRegisterDto);
        CompanyRegisterEntity investorEntity = companyRegisterService.createUser(investorRequest);
        CompanyRegisterResponseDto investorResponseDto = companyRegisterMapper.toDto(investorEntity);

        return new ResponseEntity<>(investorResponseDto, HttpStatus.CREATED);
    }



}
