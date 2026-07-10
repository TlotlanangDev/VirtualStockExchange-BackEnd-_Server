package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity.CompanyLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.mapper.CompanyLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service.CompanyLoginService;
import com.tlotlanang.virtualstockexchangebackend.User.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/company")
public class CompanyLoginController implements LoginUser<CompanyLoginResponseDto, CompanyLoginDto> {

    @Autowired
    private CompanyLoginService companyLoginService;

    @Autowired
    private CompanyLoginMapper companyLoginMapper;

    @Override
    public ResponseEntity<CompanyLoginResponseDto> loginUser(CompanyLoginDto companyLoginDto) {
        CompanyLoginRequest companyLoginRequest = companyLoginMapper.fromDto(companyLoginDto);
        CompanyLoginEntity companyLoginEntity = companyLoginService.loginUser(companyLoginRequest);
        CompanyLoginResponseDto companyLoginResponseDto = companyLoginMapper.toDto(companyLoginEntity);
        return new ResponseEntity<>(companyLoginResponseDto, HttpStatus.FOUND);
    }
}
