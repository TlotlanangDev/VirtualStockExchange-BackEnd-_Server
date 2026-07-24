package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.entity.BankerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.register.repository.BankerRegisterRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.time.LocalDate;


@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class BankerRegisterRepositoryTest {

    @Autowired
    private BankerRegisterRepository bankerRegisterRepository;

    @Test
    public void setBankerRepository_Save_ReturnSavedUser(){

        BankerRegisterEntity bankerRegisterEntity = BankerRegisterEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        BankerRegisterEntity savedToEntity = bankerRegisterRepository.save(bankerRegisterEntity);

        Assertions.assertThat(savedToEntity).isNotNull();
        Assertions.assertThat(savedToEntity.getUuid()).isNotNull();
        Assertions.assertThat(savedToEntity.getName()).isEqualTo("Tlotlanang").isNotNull();
        Assertions.assertThat(savedToEntity.getSurName()).isEqualTo("Gabonewe").isNotNull();
        Assertions.assertThat(savedToEntity.getDateOfBirth()).isEqualTo(LocalDate.of(2002,9,1)).isNotNull();
        Assertions.assertThat(savedToEntity.getPhoneNumber()).isEqualTo("0787060708").isNotNull();
        Assertions.assertThat(savedToEntity.getEmailAddress()).isEqualTo("Tlotlanang@gmail.com").isNotNull();
        Assertions.assertThat(savedToEntity.getPassWord()).isEqualTo("ergdg43gr").isNotNull();



    }

}