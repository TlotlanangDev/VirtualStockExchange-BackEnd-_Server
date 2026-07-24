package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.entity;

import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;
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


class CompanyRegisterEntityTest {

    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }

    @Test
    public void setCompanyEntity_passValidInfo_returnDataPassed(){
        CompanyRegisterEntity companyRegisterEntity = CompanyRegisterEntity.builder()
                .id(null)
                .companyName("Tlotlanang")
                .registrationNumber("Gabonewe")
                .registrationDate(LocalDate.of(2002,9,1))
                .telePhone("0787058697")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        Set<ConstraintViolation<CompanyRegisterEntity>> violations = validation.validate(companyRegisterEntity);

        List<String> failedProperties = violations.stream()
                .map(violation -> violation.getPropertyPath().toString())
                .toList();

        Assertions.assertThat(violations).isEmpty();
        Assertions.assertThat(violations.size()).isEqualTo(0);

    }

    @Test
    public void setCompanyEntity_passInValidInfo_returnData(){
        CompanyRegisterEntity companyRegisterEntity = CompanyRegisterEntity.builder()

                .companyName("d")
                .registrationNumber("s")
                .registrationDate(LocalDate.of(2032,9,1))
                .telePhone("fd0787058697")
                .emailAddress("Tlotlananggmailcom")
                .passWord("").build();

        Set<ConstraintViolation<CompanyRegisterEntity>> violations = validation.validate(companyRegisterEntity);

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