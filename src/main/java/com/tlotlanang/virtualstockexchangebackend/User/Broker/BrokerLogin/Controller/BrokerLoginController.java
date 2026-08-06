package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain.BrokerLoginResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.mapper.BrokerLoginMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.service.BrokerLoginService;
import com.tlotlanang.virtualstockexchangebackend.User.LoginUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<BrokerLoginResponseDto> loginUser(@Valid BrokerLoginDto brokerLoginDto) {
        BrokerLoginRequest brokerLoginRequest = brokerLoginMapper.fromDto(brokerLoginDto);
        BrokerLoginEntity brokerLoginEntity = brokerLoginService.loginUser(brokerLoginRequest);
        BrokerLoginResponseDto brokerLoginResponseDto = brokerLoginMapper.toDto(brokerLoginEntity);
        return new ResponseEntity<>(brokerLoginResponseDto, HttpStatus.FOUND);
    }
}
