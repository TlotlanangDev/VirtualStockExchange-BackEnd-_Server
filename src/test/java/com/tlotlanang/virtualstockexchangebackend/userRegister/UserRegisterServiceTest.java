package com.tlotlanang.virtualstockexchangebackend.userRegister;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
class UserRegisterServiceTest {

    @Mock
    UserRegisterRepository userRegisterRepository;

    @InjectMocks
    UserRegisterService userRegisterService;

    @Spy
    private UserRegisterMapper mapper = Mappers.getMapper(UserRegisterMapper.class);


    @Test
    public void testSaveToRepository(){

        UserRegisterEntity userRegisterEntity= UserRegisterEntity.builder()
                .uuid(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();

        UserRegisterDto userRegisterDto = UserRegisterDto.builder()
                .Id(null)
                .name("Tlotlanang")
                .surName("Gabonewe")
                .dateOfBirth(LocalDate.of(2002,9,1))
                .phoneNumber("0787060708")
                .emailAddress("Tlotlanang@gmail.com")
                .passWord("ergdg43gr").build();


        Mockito.when(userRegisterRepository.save(Mockito.any(UserRegisterEntity.class)))
                .thenReturn(userRegisterEntity);

        UserRegisterDto savedRepository = userRegisterService.dtoConverter(userRegisterDto);

        Assertions.assertThat(savedRepository).isNotNull();

    }

}

