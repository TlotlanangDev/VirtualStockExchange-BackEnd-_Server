package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.repository;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.registerCompany.entity.CompanyRegisterEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.math.BigDecimal;
import java.time.LocalDate;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class CompanyRegisterRepositoryTest {

    @Autowired
    private CompanyRegisterRepository companyRegisterRepository;

    @Test
    public void setCompanyRepository_Save_ReturnSavedUser(){

        CompanyRegisterEntity companyRegisterEntity = CompanyRegisterEntity.builder()
                .id(null)
                .companyName("TMG Group")
                .registrationNumber("2012/968795/07")
                .registrationDate(LocalDate.of(2012,9,1))
                .telePhone("01178574873")
                .emailAddress("tlotlanang@gmail.com")
                .passWord("vsvsvs")
                .pricePerShare(null)
                .stockShare(null).build();


        CompanyRegisterEntity savedToEntity = companyRegisterRepository.save(companyRegisterEntity);

        Assertions.assertThat(savedToEntity).isNotNull();
        Assertions.assertThat(savedToEntity.getId()).isNotNull();
        Assertions.assertThat(savedToEntity.getCompanyName()).isEqualTo("TMG Group").isNotNull();
        Assertions.assertThat(savedToEntity.getRegistrationNumber()).isEqualTo("2012/968795/07").isNotNull();
        Assertions.assertThat(savedToEntity.getRegistrationDate()).isEqualTo(LocalDate.of(2012,9,1)).isNotNull();
        Assertions.assertThat(savedToEntity.getTelePhone()).isEqualTo("01178574873").isNotNull();
        Assertions.assertThat(savedToEntity.getEmailAddress()).isEqualTo("Tlotlanang@gmail.com").isNotNull();
        Assertions.assertThat(savedToEntity.getPassWord()).isEqualTo("vsvsvs").isNotNull();
        Assertions.assertThat(savedToEntity.getPricePerShare()).isEqualTo(null).isNull();
        Assertions.assertThat(savedToEntity.getStockShare()).isEqualTo(null).isNull();

    }

}