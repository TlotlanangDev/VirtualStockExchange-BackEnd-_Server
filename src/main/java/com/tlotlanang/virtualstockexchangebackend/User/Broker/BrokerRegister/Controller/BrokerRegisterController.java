package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.Controller;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.domain.BrokerRegisterResponseDto;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.entity.BrokerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.mapper.BrokerRegisterMapper;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerRegister.service.BrokerRegisterService;
import com.tlotlanang.virtualstockexchangebackend.User.RegisterUser;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/stockExchange/broker")
public class BrokerRegisterController implements RegisterUser<BrokerRegisterResponseDto, BrokerRegisterDto> {
    @Autowired
    public BrokerRegisterService brokerRegisterService;

    @Autowired
    public BrokerRegisterMapper brokerRegisterMapper;


    @Override
    public ResponseEntity<BrokerRegisterResponseDto> registerUser(@Valid @RequestBody BrokerRegisterDto brokerRegisterDto) {
        BrokerRegisterRequest brokerRegisterRequest = brokerRegisterMapper.fromDto(brokerRegisterDto);
        BrokerRegisterEntity brokerRegisterEntity = brokerRegisterService.createUser(brokerRegisterRequest);
        BrokerRegisterResponseDto brokerregisterResponseDto = brokerRegisterMapper.toDto(brokerRegisterEntity);

        return new ResponseEntity<>(brokerregisterResponseDto, HttpStatus.CREATED);
    }






}
