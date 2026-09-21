package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.domain;


import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

class BankerLoginDtoTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBankerLoginDto_passValidData_returnDataPassed(){

        BankerLoginDto bankerLoginDto = BankerLoginDto.builder()
                .emailAddress("tlotlanang@gmail.com")
                .passWord("fvsvsvsvsdv42")
                .build();

        Set<ConstraintViolation<BankerLoginDto>> violations = validation.validate(bankerLoginDto);

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);
    }

    @Test
    public void setBankerLoginDto_passInvalidData_returnDataPassed(){

        BankerLoginDto bankerLoginDto = BankerLoginDto.builder()
                .emailAddress("tlotlananggmailcom")
                .passWord("")
                .build();

        Set<ConstraintViolation<BankerLoginDto>> violations = validation.validate(bankerLoginDto);

        List<String>failedProperties = violations.stream()
                .map(violation->violation.getPropertyPath().toString()).toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains(
                "emailAddress",
                "passWord");

    }
}