package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.controller;


import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.domain.BankerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.entity.BankerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.mapper.BankerLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.login.service.BankerLoginService;
import com.tlotlanang.virtualstockexchangebackend.User.LoginUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/banker")
public class BankerLoginController implements LoginUser<BankerLoginResponseDto, BankerLoginDto> {

    @Autowired
    private BankerLoginService bankerLoginService;

    @Autowired
    private BankerLoginMapper bankerLoginMapper;

    @Override
    public ResponseEntity<BankerLoginResponseDto> loginUser(@Valid BankerLoginDto bankerLoginDto) {
        BankerLoginRequest companyLoginRequest = bankerLoginMapper.fromDto(bankerLoginDto);
        BankerLoginEntity companyLoginEntity = bankerLoginService.loginUser(companyLoginRequest);
        BankerLoginResponseDto bankerLoginResponseDto = bankerLoginMapper.toDto(companyLoginEntity);
        return new ResponseEntity<>(bankerLoginResponseDto, HttpStatus.FOUND);
    }
}
