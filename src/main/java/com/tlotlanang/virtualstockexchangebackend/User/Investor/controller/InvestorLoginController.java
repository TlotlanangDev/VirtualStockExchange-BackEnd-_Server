package com.tlotlanang.virtualstockexchangebackend.User.Investor.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.mapper.InvestorLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.service.InvestorLoginService;
import com.tlotlanang.virtualstockexchangebackend.User.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/investor")
public class InvestorLoginController implements LoginUser<InvestorLoginResponseDto, InvestorLoginDto> {

    @Autowired
    private InvestorLoginService investorLoginService;

    @Autowired
    private InvestorLoginMapper investorLoginMapper;

    @Override
    public ResponseEntity<InvestorLoginResponseDto> loginUser(InvestorLoginDto investorLoginDto) {
        InvestorLoginRequest investorLoginRequest = investorLoginMapper.fromDto(investorLoginDto);
        InvestorLoginEntity investorLoginEntity = investorLoginService.loginUser(investorLoginRequest);
        InvestorLoginResponseDto bankerLoginResponseDto = investorLoginMapper.toDto(investorLoginEntity);
        return new ResponseEntity<>(bankerLoginResponseDto, HttpStatus.FOUND);
    }
}
