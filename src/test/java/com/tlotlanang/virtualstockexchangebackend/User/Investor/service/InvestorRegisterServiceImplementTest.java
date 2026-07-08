package com.tlotlanang.virtualstockexchangebackend.User.Investor.service;

import com.tlotlanang.virtualstockexchangebackend.User.Investor.domain.InvestorRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.entity.InvestorRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.Investor.repository.InvestorRegisterRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;


@ExtendWith(MockitoExtension.class)
class InvestorRegisterServiceImplementTest {

    @Mock
    private InvestorRegisterRepository investorRegisterRepository;

    @InjectMocks
    private InvestorRegisterServiceImplement investorServiceImplement;

    @Test
    public void testSaveToRepository(){

        InvestorRegisterEntity investorRegisterEntity = InvestorRegisterEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        InvestorRegisterRequest investorRegisterRequest = InvestorRegisterRequest.builder()
                //.Id(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();


        Mockito.when(investorRegisterRepository.save(Mockito.any(InvestorRegisterEntity.class)))
                .thenReturn(investorRegisterEntity);

        InvestorRegisterEntity savedRepository = investorServiceImplement.createUser(investorRegisterRequest);

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