package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.entity;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

class BankerLoginEntityTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBankerLoginEntity_passVaslidData_returnDataPassed(){
        BankerLoginEntity bankerLoginEntity = BankerLoginEntity.builder()
                .emailAddress("tlotlananggabonewe@gmail.com")
                .passWord("f7esfuf2fuwi").build();

        Set<ConstraintViolation<BankerLoginEntity>>violations = validation.validate(bankerLoginEntity);

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);
    }

    @Test
    public void setBankerLoginEntity_passInvalidData_returnDataPassed(){
        BankerLoginEntity bankerLoginEntity = BankerLoginEntity.builder()
                .emailAddress("tlotlananggabonewegmailcom")
                .passWord("i").build();

        Set<ConstraintViolation<BankerLoginEntity>>violations = validation.validate(bankerLoginEntity);

        List<String>failedProperties = violations.stream()
                .map(violation->violation.getPropertyPath().toString()).toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains(
                "emailAddress", "passWord");


    }

}