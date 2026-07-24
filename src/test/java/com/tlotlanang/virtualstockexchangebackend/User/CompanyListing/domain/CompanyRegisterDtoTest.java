package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.domain;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterDto;
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

class CompanyRegisterDtoTest {
    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setCompanyDto_passValidInfo_returnDataPassed(){
        CompanyRegisterDto companyRegisterDto = CompanyRegisterDto.builder()

                .companyName("Tlotlanang")
                .registrationNumber("Gabonewe")
                .registrationDate(LocalDate.of(2002,9,1))
                .telePhone("0787058697")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        Set<ConstraintViolation<CompanyRegisterDto>> violations = validation.validate(companyRegisterDto);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);



    }

    @Test
    public void setCompanyDto_passInValidInfo_returnData(){
        CompanyRegisterDto companyRegisterDto = CompanyRegisterDto.builder()

                .companyName("d")
                .registrationNumber("s")
                .registrationDate(LocalDate.of(2032,9,1))
                .telePhone("fd0787058697")
                .emailAddress("Tlotlananggmailcom")
                .passWord("").build();

        Set<ConstraintViolation<CompanyRegisterDto>> violations = validation.validate(companyRegisterDto);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains("name",
                "registrationNumber",
                "registrationDate",
                "telePhone",
                "emailAddress",
                "passWord");


    }
}