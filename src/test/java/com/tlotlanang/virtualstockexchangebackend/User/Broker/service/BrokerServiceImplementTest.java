package com.tlotlanang.virtualstockexchangebackend.User.Broker.service;

import com.tlotlanang.virtualstockexchangebackend.User.Broker.domain.BrokerRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.entity.BrokerEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Broker.repository.BrokerRepository;
import com.tlotlanang.virtualstockexchangebackend.userRegister.domain.UserRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.userRegister.entity.UserRegisterEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension .class)
class BrokerServiceImplementTest {

    @Mock
    private BrokerRepository brokerRepository;

    @InjectMocks
    BrokerServiceImplement brokerServiceImplement;

    @Test
    public void testSaveToRepository(){

        BrokerEntity brokerEntity= BrokerEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        BrokerRequest brokerRequest = BrokerRequest.builder()
                //.Id(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();


        Mockito.when(brokerRepository.save(Mockito.any(BrokerEntity.class)))
                .thenReturn(brokerEntity);

        BrokerEntity savedRepository = brokerServiceImplement.createUser(brokerRequest);

        Assertions.assertThat(savedRepository).isNotNull();
        Assertions.assertThat(savedRepository.getUuid()).isNull();
        Assertions.assertThat(savedRepository.getName()).isEqualTo("Tlotlanang").isNotNull();
        Assertions.assertThat(savedRepository.getSurName()).isEqualTo("Gabonewe").isNotNull();
        Assertions.assertThat(savedRepository.getDateOfBirth()).isEqualTo(LocalDate.of(2002,9,1)).isNotNull();
        Assertions.assertThat(savedRepository.getPhoneNumber()).isEqualTo("0787060708").isNotNull();
        Assertions.assertThat(savedRepository.getEmailAddress()).isEqualTo("Tlotlanang@gmail.com").isNotNull();
        Assertions.assertThat(savedRepository.getPassWord()).isEqualTo("ergdg43gr").isNotNull();

    }


}