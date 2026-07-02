package com.tlotlanang.virtualstockexchangebackend.userRegister;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.time.LocalDate;
import java.util.UUID;


@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class UserRegisterRepositoryTest {

    @Autowired
    private UserRegisterRepository userregisterrepository;


    @Test
    public void setUserRegisterRepository_Save_ReturnSavedUser(){

        UserRegisterEntity userRegisterEntity= UserRegisterEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,01))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        UserRegisterEntity savedToEntity = userregisterrepository.save(userRegisterEntity);

        Assertions.assertThat(savedToEntity).isNotNull();



    }


}