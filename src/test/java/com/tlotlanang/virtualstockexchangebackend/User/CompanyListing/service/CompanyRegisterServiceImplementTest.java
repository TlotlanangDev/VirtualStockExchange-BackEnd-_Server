package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.service;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.domain.CompanyRegisterRequest;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.entity.CompanyRegisterEntity;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.repository.CompanyRegisterRepository;
import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.register.service.CompanyRegisterServiceImplement;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;


@ExtendWith(MockitoExtension.class)
class CompanyRegisterServiceImplementTest {

    @Mock
    private CompanyRegisterRepository companyRegisterRepository;

    @InjectMocks
    CompanyRegisterServiceImplement companyServiceImplement;

    @Test
    public void testSaveToRepository(){

        CompanyRegisterEntity companyRegisterEntity = CompanyRegisterEntity.builder()
                .id(null)
                .companyName("Tlotlanang")
                .registrationNumber("Gabonewe")
                .registrationDate(LocalDate.of(2002,9,1))
                .telePhone("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        CompanyRegisterRequest companyRegisterRequest = CompanyRegisterRequest.builder()
                //.Id(null)
                .companyName("Tlotlanang")
                .registrationNumber("Gabonewe")
                .registrationDate(LocalDate.of(2002,9,1))
                .telePhone("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();


        Mockito.when(companyRegisterRepository.save(Mockito.any(CompanyRegisterEntity.class)))
                .thenReturn(companyRegisterEntity);

        CompanyRegisterEntity savedRepository = companyServiceImplement.createUser(companyRegisterRequest);

        Assertions.assertThat(savedRepository).isNotNull();
        Assertions.assertThat(savedRepository.getId()).isNull();
        Assertions.assertThat(savedRepository.getCompanyName()).isEqualTo("Tlotlanang").isNotNull();
        Assertions.assertThat(savedRepository.getRegistrationNumber()).isEqualTo("Gabonewe").isNotNull();
        Assertions.assertThat(savedRepository.getRegistrationDate()).isEqualTo(LocalDate.of(2002,9,1)).isNotNull();
        Assertions.assertThat(savedRepository.getTelePhone()).isEqualTo("0787060708").isNotNull();
        Assertions.assertThat(savedRepository.getEmailAddress()).isEqualTo("Tlotlanang@gmail.com").isNotNull();
        Assertions.assertThat(savedRepository.getPassWord()).isEqualTo("ergdg43gr").isNotNull();

    }

}