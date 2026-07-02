package com.tlotlanang.virtualstockexchangebackend.userRegister;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserRegisterDtoTest {
    private Validator validation;
    @BeforeEach
    void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validation = factory.getValidator();
    }
    @Test
    public void setUserRegisterDto_passValidInfo_returnDataPassed(){
        UserRegisterDto userRegisterDto = UserRegisterDto.builder()
                .Id(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();
        Set<ConstraintViolation<UserRegisterDto>> violations = validation.validate(userRegisterDto);

        Assertions.assertThat(violations).isEmpty();

    }
}