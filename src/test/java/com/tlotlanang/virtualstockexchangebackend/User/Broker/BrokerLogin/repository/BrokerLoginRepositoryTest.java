package com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.repository;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.BrokerLogin.entity.BrokerLoginEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class BrokerLoginRepositoryTest {

    @Autowired
    private BrokerLoginRepository brokerLoginRepository;

    @Test
    public void setBrokerLoginRepository_findByEmail_returnData(){

        BrokerLoginEntity brokerLoginEntity = BrokerLoginEntity.builder()
                .emailAddress("tlotlanang@gmail.com")
                .passWord("wvvsvsvsvs4").build();
        Optional<BrokerLoginEntity> brokerLogin = brokerLoginRepository.findById(brokerLoginEntity.getEmailAddress());

        Assertions.assertThat(brokerLogin).isNotNull();


    }

}