package com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.repository;


import com.tlotlanang.virtualstockexchangebackend.User.CompanyListing.ListCompany.entity.CompanyListingEntity;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;

import java.math.BigDecimal;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
class CompanyListingRepositoryTest {

    @Autowired
    private CompanyListingRepository companyListingRepository;

    @Test
    public void setCompanyListingRepo_Save_ReturnSavedData(){

        CompanyListingEntity companyListingEntity = CompanyListingEntity.builder()
                .id(null)
                .companyName("TMG Group")
                .registrationNumber("2012/968795/07")
                .stockShare(340)
                .pricePerShare(BigDecimal.valueOf(400.4))
                .build();

        CompanyListingEntity savedToEntity = companyListingRepository.save(companyListingEntity);

        Assertions.assertThat(savedToEntity).isNotNull();
        Assertions.assertThat(savedToEntity.getId()).isEqualTo(null).isNull();
        Assertions.assertThat(savedToEntity.getCompanyName()).isEqualTo("TMG Group").isNotNull();
        Assertions.assertThat(savedToEntity.getRegistrationNumber()).isEqualTo("2012/968795/07").isNotNull();
        Assertions.assertThat(savedToEntity.getStockShare()).isEqualTo(340).isNotNull();
        Assertions.assertThat(savedToEntity.getPricePerShare()).isEqualTo(BigDecimal.valueOf(400.4)).isNotNull();
    }

}