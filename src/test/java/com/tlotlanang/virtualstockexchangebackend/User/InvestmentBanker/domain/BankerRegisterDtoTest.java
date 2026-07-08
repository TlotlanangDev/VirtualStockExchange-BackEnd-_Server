package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain;

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


class BankerRegisterDtoTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setBankerDto_passValidInfo_returnDataPassed(){
        BankerRegisterDto bankerRegisterDto = BankerRegisterDto.builder()

                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787058697")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        Set<ConstraintViolation<BankerRegisterDto>> violations = validation.validate(bankerRegisterDto);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);



    }

    @Test
    public void setBankerDto_passInValidInfo_returnData(){
        BankerRegisterDto bankerRegisterDto = BankerRegisterDto.builder()

                .name("d")
                .surName("s")
                .dateOfBirth(LocalDate.of(2032,9,1))
                .phoneNumber("fd0787058697")
                .emailAddress("Tlotlananggmailcom")
                .passWord("").build();

        Set<ConstraintViolation<BankerRegisterDto>> violations = validation.validate(bankerRegisterDto);

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