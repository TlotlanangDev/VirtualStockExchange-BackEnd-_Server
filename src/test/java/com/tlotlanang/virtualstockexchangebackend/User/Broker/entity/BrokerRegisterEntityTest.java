package com.tlotlanang.virtualstockexchangebackend.User.Broker.entity;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;


class BrokerRegisterEntityTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBrokerEntity_passValidInfo_returnDataPassed(){
        BrokerRegisterEntity brokerRegisterEntity = BrokerRegisterEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787058697")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        Set<ConstraintViolation<BrokerRegisterEntity>> violations = validation.validate(brokerRegisterEntity);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);

    }

    @Test
    public void setBrokerEntity_passInValidInfo_returnData(){
        BrokerRegisterEntity brokerRegisterEntity = BrokerRegisterEntity.builder()

                .name("d")
                .surName("s")
                .dateOfBirth(LocalDate.of(2032,9,1))
                .phoneNumber("fd0787058697")
                .emailAddress("Tlotlananggmailcom")
                .passWord("").build();

        Set<ConstraintViolation<BrokerRegisterEntity>> violations = validation.validate(brokerRegisterEntity);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains("name",
                "surName",
                "dateOfBirth",
                "phoneNumber",
                "emailAddress",
                "passWord");


    }

}