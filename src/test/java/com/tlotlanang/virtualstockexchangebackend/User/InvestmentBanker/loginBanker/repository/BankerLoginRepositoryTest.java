package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.repository;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.loginBanker.entity.BankerLoginEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class BankerLoginRepositoryTest {

    @Autowired
    private BankerLoginRepository bankerLoginRepository;

    @Test
    public void setBankerLoginRepository_findByEmail_returnData(){

        BankerLoginEntity bankerLoginEntity = BankerLoginEntity.builder()
                .emailAddress("tlotlanang@gmail.com")
                .passWord("wvvsvsvsvs4")
                .build();
        Optional<BankerLoginEntity>bankerLogin = bankerLoginRepository.findById(bankerLoginEntity.getEmailAddress());
        Assertions.assertThat(bankerLogin).isNotNull();

    }

}