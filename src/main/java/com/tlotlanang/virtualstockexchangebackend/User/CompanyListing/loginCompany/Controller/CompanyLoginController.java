package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.domain.CompanyLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.entity.CompanyLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.mapper.CompanyLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.loginCompany.service.CompanyLoginService;
import com.tlotlanang.virtualstockexchangebackend.User.LoginUser;
import jakarta.validation.Valid;
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
    public ResponseEntity<CompanyLoginResponseDto> loginUser(@Valid CompanyLoginDto companyLoginDto) {
        CompanyLoginRequest companyLoginRequest = companyLoginMapper.fromDto(companyLoginDto);
        CompanyLoginEntity companyLoginEntity = companyLoginService.loginUser(companyLoginRequest);
        CompanyLoginResponseDto companyLoginResponseDto = companyLoginMapper.toDto(companyLoginEntity);
        return new ResponseEntity<>(companyLoginResponseDto, HttpStatus.FOUND);
    }
}