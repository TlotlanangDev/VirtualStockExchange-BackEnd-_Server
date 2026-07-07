package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity;


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


class BankerEntityTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBankerEntity_passValidInfo_returnDataPassed(){
        BankerEntity bankerEntity = BankerEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787058697")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        Set<ConstraintViolation<BankerEntity>> violations = validation.validate(bankerEntity);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);

    }

    @Test
    public void setBankerEntity_passInValidInfo_returnData(){
        BankerEntity bankerEntity = BankerEntity.builder()

                .name("d")
                .surName("s")
                .dateOfBirth(LocalDate.of(2032,9,1))
                .phoneNumber("fd0787058697")
                .emailAddress("Tlotlananggmailcom")
                .passWord("").build();

        Set<ConstraintViolation<BankerEntity>> violations = validation.validate(bankerEntity);

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