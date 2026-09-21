package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

class BrokerLoginEntityTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBrokerLoginEntity_passValidInfo_ReturnDataPassed(){

        BrokerLoginEntity brokerLoginEntity = BrokerLoginEntity.builder()
                .emailAddress("tlotlananggabonewe@gmail.com")
                .passWord("f7esfuf2fuwi").build();

        Set<ConstraintViolation<BrokerLoginEntity>>violations = validation.validate(brokerLoginEntity);

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);
    }

    @Test
    public void setBrokerLoginEntity_passInValidInfo_ReturnDataPassed(){

        BrokerLoginEntity brokerLoginEntity = BrokerLoginEntity.builder()
                .emailAddress("tlotlananggabonewegmailcom")
                .passWord("fui").build();

        Set<ConstraintViolation<BrokerLoginEntity>>violations = validation.validate(brokerLoginEntity);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains(
                "emailAddress", "passWord");
    }

}