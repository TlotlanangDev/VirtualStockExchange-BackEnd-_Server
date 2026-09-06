package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.domain;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
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

                .companyName("TMG Group")
                .registrationNumber("2012/968795/07")
                .registrationDate(LocalDate.of(2012, 9, 7))
                .telePhone("0787041819")
                .emailAddress("tlotlanang@gmail.com")
                .passWord("weegbdbdbdfgsg")
                .stockShare(null)
                .pricePerShare(null)
                .build();

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
                .passWord("")
                .stockShare(200)
                .pricePerShare(BigDecimal.valueOf(240)).build();

        Set<ConstraintViolation<CompanyRegisterDto>> violations = validation.validate(companyRegisterDto);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isNotEmpty();
        Assertions.assertThat(failedProperties).contains(
                "companyName",
                "registrationNumber",
                "registrationDate",
                "telePhone",
                "emailAddress",
                "passWord");


    }
}