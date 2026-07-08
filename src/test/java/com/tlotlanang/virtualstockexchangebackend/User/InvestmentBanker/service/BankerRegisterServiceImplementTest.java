package com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.service;

import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.domain.BankerRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.entity.BankerRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.InvestmentBanker.repository.BankerRegisterRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;


@ExtendWith(MockitoExtension.class)
class BankerRegisterServiceImplementTest {

    @Mock
    private BankerRegisterRepository bankerRegisterRepository;

    @InjectMocks
    private BankerRegisterServiceImplement bankerServiceImplement;

    @Test
    public void testSaveToRepository(){

        BankerRegisterEntity bankerRegisterEntity = BankerRegisterEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        BankerRegisterRequest bankerRegisterRequest = BankerRegisterRequest.builder()
                //.Id(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();


        Mockito.when(bankerRegisterRepository.save(Mockito.any(BankerRegisterEntity.class)))
                .thenReturn(bankerRegisterEntity);

        BankerRegisterEntity savedRepository = bankerServiceImplement.createUser(bankerRegisterRequest);

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