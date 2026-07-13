package com.tlotlanang.virtualstockexchangebackend.User.Broker.controller;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.*;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.mapper.BrokerLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.service.BrokerLoginService;
import com.tlotlanang.virtualstockexchangebackend.User.LoginUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/broker")
public class BrokerLoginController implements LoginUser<BrokerLoginResponseDto, BrokerLoginDto> {

    @Autowired
    private BrokerLoginService brokerLoginService;

    @Autowired
    private BrokerLoginMapper brokerLoginMapper;

    @Override
    public ResponseEntity<BrokerLoginResponseDto> loginUser(@Valid @RequestBody BrokerLoginDto brokerLoginDto) {
        BrokerLoginRequest brokerLoginRequest = brokerLoginMapper.fromDto(brokerLoginDto);
        BrokerLoginEntity brokerLoginEntity = brokerLoginService.loginUser(brokerLoginRequest);
        BrokerLoginResponseDto brokerLoginResponseDto = brokerLoginMapper.toDto(brokerLoginEntity);
        return new ResponseEntity<>(brokerLoginResponseDto, HttpStatus.FOUND);
    }
}
