package com.tlotlanang.virtualstockexchangebackend.User.Broker.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class BrokerEmailPassExceptionDetails {

    private String message;
    private HttpStatus httpStatus;
    private LocalDateTime localDate;
}
