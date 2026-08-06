package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.domain;

import jakarta.validation.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;


class BrokerLoginDtoTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBrokerLoginDto_passValidData_returnDataPassed(){

        BrokerLoginDto brokerLoginDto = BrokerLoginDto.builder()
                .emailAddress("tlotlanang@gmail.com")
                .passWord("fvsvsvsvsdv42")
                .build();

        Set<ConstraintViolation<BrokerLoginDto>>violations = validation.validate(brokerLoginDto);


        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);
    }

    @Test
    public void setBrokerLoginDto_passInValidData_returnDataPassed(){

        BrokerLoginDto brokerLoginDto = BrokerLoginDto.builder()
                .emailAddress("tlotlananggmail.com")
                .passWord("f2")
                .build();

        Set<ConstraintViolation<BrokerLoginDto>>violations = validation.validate(brokerLoginDto);

        List<String>failedProperties = violations.stream()
                .map(violation -> violation
                        .getPropertyPath().toString()).toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains(
                "emailAddress",
                "passWord");
    }

}